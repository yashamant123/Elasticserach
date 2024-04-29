package org.exercise.ElasticKibana;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequest {


	@Test
	public static void createRecord() {

		String jsonString = "{\"TestCase\" : \"TestCase8\",\"status\" : \"pass\"}";

		/*
		 * Construct a request specification
		 */
		RequestSpecification request = RestAssured.given();

		/*
		 * Setting content type to specify the format in which the request payload will
		 * be sent.
		 */
		request.contentType(ContentType.JSON);

		/*
		 * Adding URI
		 */
		request.baseUri("http://localhost:9200/sanitysuite/1/8");

		/*
		 * Adding body as string
		 */
		request.body(jsonString);

		/*
		 * Calling POST method on URI. After hitting, we get Response
		 */
		Response response = request.post();

		/*
		 * Printing Response as string
		 */
		System.out.println(response.asString());

		/*
		 * Get Validatable response to perform validation
		 */
		ValidatableResponse validatableResponse = response.then();

		/*
		 * Validate status code as 201
		 */
		validatableResponse.statusCode(201);

		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());

	}
	public void TestCasePass(String testCaseName) {
		//String jsonString = "{\"TestCase\" : "+testCaseName+" ,\"status\" : \"pass\"}";
		String str="{\r\n"
				+ "    \"TestCase\" :\""+testCaseName+"\",\r\n"
				+ "    \"status\" :\"pass\"\r\n"
				+ "}";
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.baseUri("http://localhost:9200/sanitysuite/1");
		request.body(str);
		Response response = request.post();
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
	}
	public void TestCaseFail(String testCaseName) {
		//String jsonString = "{\"TestCase\" : "+testCaseName+" ,\"status\" : \"fail\"}";
		String str="{\r\n"
				+ "    \"TestCase\" :\""+testCaseName+"\",\r\n"
				+ "    \"status\" :\"fail\"\r\n"
				+ "}";
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.baseUri("http://localhost:9200/sanitysuite/1");
		request.body(str);
		Response response = request.post();
		System.out.println(response.asString());		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
	}


}
