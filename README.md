# Taller - Equipo de Ciclismo

Taller de Programación II (POO en Java con Maven). El programa simula un equipo
de ciclismo conformado por ciclistas de diferentes especialidades, aplicando
herencia, polimorfismo, clases abstractas y composición.

## Integrantes

- Germán Darío Bolaños Gaviria
- Jhon Alexis Correa


## Estructura del proyecto

El código está en el paquete `com.uniajc`:

- **Ciclista** (clase abstracta): molde base de todos los ciclistas. Tiene
  identificador, nombre y tiempo acumulado (privados), el método abstracto
  `imprimirTipo()` y el método `imprimirDatos()`.
- **Velocista, Escalador, Contrarrelojista**: subclases que heredan de Ciclista
  (`extends`) y agregan sus propios atributos. Cada una sobrescribe
  `imprimirTipo()` e `imprimirDatos()` con `@Override`.
- **Equipo**: agrupa un conjunto de ciclistas en una `List<Ciclista>`. Tiene
  nombre, país y el tiempo total del equipo (atributo `static`). Permite añadir
  ciclistas, listarlos y buscarlos por id.
- **Main**: crea un equipo, le añade ciclistas de distintos tipos y muestra la
  información.

## Conceptos de POO aplicados

- **Herencia:** las subclases reutilizan los atributos y métodos de Ciclista
  usando `extends` y `super`.
- **Clases abstractas:** Ciclista no se puede instanciar directamente; obliga a
  cada subclase a implementar `imprimirTipo()`.
- **Polimorfismo:** el Main y el Equipo tratan a los ciclistas como `Ciclista`
  genéricos, pero en tiempo de ejecución cada objeto ejecuta su propia versión
  de los métodos.
- **Composición:** un Equipo está compuesto por una lista de ciclistas.

## Pruebas unitarias

Hechas con JUnit 5, en `src/test/java/com/uniajc/`. Cubren la creación de los
objetos, los getters/setters, el método `imprimirTipo()` de cada ciclista, y la
lógica del Equipo (añadir ciclistas y sumar el tiempo total).