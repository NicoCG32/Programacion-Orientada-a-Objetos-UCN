# Respuestas del Ruteo GUI

## ¿Al presionar qué botón aparece un mensaje por la pantalla?

El mensaje aparece al presionar el último botón creado, que es **B5**. En `Main.java`, el `ActionListener` se agrega después del `for`, por lo que queda asociado al último botón instanciado.

## ¿Qué sucede al presionar el botón "X" de la ventana principal de su aplicación?

No se cierra la aplicación. La ventana ignora el evento de cierre porque se configura con:

```java
frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
```
