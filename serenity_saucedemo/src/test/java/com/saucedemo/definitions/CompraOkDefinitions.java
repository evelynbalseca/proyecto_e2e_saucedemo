package com.saucedemo.definitions;

import com.saucedemo.configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CompraOkDefinitions {

    private WebDriver driver;
    private WebDriverWait wait;
    private int ms=1000;


    public CompraOkDefinitions() throws InterruptedException {
        this.driver = WebDriverManager.getDriver();
    }

    @Given("el usuario ingresa a la pagina saucedemo {string}")
    public void el_usuario_ingresa_a_la_pagina_saucedemo(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(ms);
    }

    @When("el usuario ingresa el nombre de usuario {string} y contraseña {string} y da clic en Login")
    public void el_usuario_ingresa_el_nombre_de_usuario_y_contraseña_y_da_clic_en_login(String user, String password) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(ms);
    }

    @When("selecciona el primer producto {string} y seleciona el segundo producto {string}")
    public void selecciona_el_primer_producto_y_seleciona_el_segundo_producto(String producto1, String producto2) throws InterruptedException {
        driver.findElement(By.id(producto1)).click();
        Thread.sleep(ms);
        driver.findElement(By.id(producto2)).click();
        Thread.sleep(ms);
    }


    @When("va al carrito el compras {string}")
    public void va_al_carrito_el_compras(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(ms);
    }


    @When("paga la compra")
    public void paga_la_compra() throws InterruptedException {
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(ms);
    }


    @When("completa el formulario de compra y confirma la compra")
    public void completa_el_formulario_de_compra_y_confirma_la_compra() throws InterruptedException {
        driver.findElement(By.id("first-name")).sendKeys("Evelyn");
        driver.findElement(By.id("last-name")).sendKeys("Balseca");
        driver.findElement(By.id("postal-code")).sendKeys("593");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(ms);
    }

    @Then("finaliza la compra  y se muestra el mensaje {string}")
    public void finaliza_la_compra_y_se_muestra_el_mensaje (String mensaje) throws InterruptedException {

        driver.findElement(By.id("finish")).click();
        System.out.println("mensaje esperado: "+mensaje);
        String mensajeReal = "";
        mensajeReal = driver.findElement(By.className("complete-header")).getText();
        System.out.println("mensaje real: "+mensajeReal);
        Assert.assertEquals(mensaje,mensajeReal);
        Thread.sleep(ms);
    }
}
