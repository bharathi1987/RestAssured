package RestAssured;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;


import java.io.IOException;

public class SchemaValidator {

    public static void main(String[] args) {
        // Load JSON schema
        String schemaJson = "{ \"type\": \"object\", \"properties\": { \"name\": { \"type\": \"string\" } } }";
        JsonNode schemaNode = loadJsonNode(schemaJson);

        // Load JSON instance
        String jsonData = "{ \"name\": \"John\" }";
        JsonNode jsonNode = loadJsonNode(jsonData);

        // Perform validation
        try {
            JsonSchema schema = JsonSchemaFactory.byDefault().getJsonSchema(schemaNode);
            schema.validate(jsonNode);
            System.out.println("Validation successful.");
        } catch (ProcessingException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }

    private static JsonNode loadJsonNode(String json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readTree(json);
        } catch (IOException e) {
            throw new RuntimeException("Error loading JSON node", e);
        }
    }


/*        <dependency>
            <groupId>com.github.fge</groupId>
            <artifactId>json-schema-validator</artifactId>
            <version>2.2.14</version> <!-- Check for the latest version on Maven Central -->
        </dependency>*/
}
