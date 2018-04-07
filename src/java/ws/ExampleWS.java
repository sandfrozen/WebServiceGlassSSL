package ws;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomek.buslowski
 */
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ExampleWS {
    
    @WebMethod
    public int sum(int a, int b) {
        return a + b;
    }

    @WebMethod
    public int multiply(int a, int b) {
        return a * b;
    }

    @WebMethod
    public String greet(String name) {
        return "Hello " + name + "!";
    }
}
