package us.opencart.abstracta.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/flujo-compra-producto.feature",
        glue = "us.opencart.abstracta.stepDefinitions",
        tags = "@CompraProducto",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
