# Respuestas del Ruteo GUI

## ¿Al presionar qué botón aparece un mensaje por la pantalla?

El mensaje aparece al presionar el ultimo boton creado, que es **B5**. En `Main.java`, el `ActionListener` se agrega despues del `for`, por lo que queda asociado al ultimo boton instanciado.

## ¿Que sucede al presionar el boton "X" de la ventana principal de su aplicacion?

No se cierra la aplicacion. La ventana ignora el evento de cierre porque se configura con:

```java
frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
```