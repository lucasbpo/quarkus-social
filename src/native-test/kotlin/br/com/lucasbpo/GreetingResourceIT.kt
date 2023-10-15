package br.com.lucasbpo

import io.quarkus.test.junit.QuarkusIntegrationTest

@QuarkusIntegrationTest
class GreetingResourceIT : GreetingResourceTest() { // Execute the same tests but in packaged mode.
}
