# Shopping Kata

## 🎯 Objetivos

El objetivo de esta Kata es practicar los principios fundamentales de la Programación Orientada a Objetos (OOP) tales como:

- **Abstracción**
- **Encapsulación**
- **Herencia**
- **Polimorfismo**
- **Interfaces**

Además, se debe aplicar la metodología **TDD** (Desarrollo Guiado por Pruebas) durante todo el proceso.

### 🚧 **Metodología: Test → Rojo → Verde → Refactor 🔁**

1. **Test**: Comienza escribiendo un test que falle.
2. **Rojo**: Asegúrate de que el test falle antes de continuar.
3. **Verde**: Escribe el código más sencillo posible para hacer pasar el test.
4. **Refactor**: Refactoriza el código de forma limpia sin romper los tests.

---

## ⚙️ Requisitos Funcionales

- **Todos los productos** tienen **nombre** y **precio**.
  
- **Productos de Alimentación (`FoodProduct`)**:
    - Se les puede añadir un **descuento** (%).
    - El **precio de un producto sin descuento** es el precio original del producto.
    - El **precio de un producto con descuento** es el precio original con el descuento del % asignado.

- **Carro de la Compra (`Cart`)**:
    - Se le pueden añadir **productos uno a uno** (pero no puede tener dos productos repetidos).
    - Podemos consultar la **lista de productos** añadidos al carrito.
    - El carrito permite **eliminar un producto** por su nombre.
    - El **carro de la compra (`Cart`)** contiene un número de productos (puede ser cero).
    - El **coste total del carro** es la **suma de los precios de los productos**, aplicando los descuentos.

- **Productos de Tipo Libro (`Book`)**:
    - Los productos de tipo libro tienen un **autor** y una **descripción** (además de nombre y precio).
    - Se les puede añadir un **descuento**, pero este **no puede ser mayor del 10%** del precio original.

## ⚙️ UML

![image](https://github.com/user-attachments/assets/93eea82c-2ef3-47cf-b4f6-4573dca64f58)


