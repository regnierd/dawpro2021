package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.api.Operacion;
import es.iespuertodelacruz.javier.vista.App;

public class AppVistaTest {
    String[] args = null;
   private ByteArrayInputStream testIn;
   App appVista;
   Operacion operacion = null;

   @BeforeEach
   public void setUp(){
      if (appVista == null) {
         appVista = new App();
      }
   }


   @Test
   public void sumaTest(){
      
      operacion = null;
      String[] args = null;
      testIn = new ByteArrayInputStream("1 2 2 5".getBytes());
      System.setIn(testIn);
      try {
         appVista.main(args);
      } catch (Exception e) {
         fail("Se ha producido un error realizando la operacion suma:"+e.getMessage());
      }
      
   } 

   @Test
   public void restaTest(){
      
      operacion = null;
      String[] args = null;
      testIn = new ByteArrayInputStream("2 2 2 5".getBytes());
      System.setIn(testIn);
      try {
         appVista.main(args);
      } catch (Exception e) {
         fail("Se ha producido un error realizando la operacion suma:"+e.getMessage());
      }
      
   } 

   @Test
   public void multiplicacionTest(){
      
      operacion = null;
      String[] args = null;
      testIn = new ByteArrayInputStream("3 2 2 5".getBytes());
      System.setIn(testIn);
      try {
         appVista.main(args);
      } catch (Exception e) {
         fail("Se ha producido un error realizando la operacion suma:"+e.getMessage());
      }
      
   } 
   @Test
   public void divisionTest(){
      
      operacion = null;
      String[] args = null;
      testIn = new ByteArrayInputStream("4 2 2 5".getBytes());
      System.setIn(testIn);
      try {
         appVista.main(args);
      } catch (Exception e) {
         fail("Se ha producido un error realizando la operacion suma:"+e.getMessage());
      }
      
   }

   @Test
   public void errorEleccionMenuTest(){
      
      operacion = null;
      String[] args = null;
      testIn = new ByteArrayInputStream("6 a".getBytes());
      System.setIn(testIn);
      try {
         appVista.main(args);
      } catch (Exception exception) {
         if (exception instanceof NoSuchElementException) {
            assertTrue(true);
         } else {
            fail("Se ha producido un error realizando la operacion suma:"+exception.getMessage());
         }
         
      }
      
   }
}
