# Programacion_II_Galan_Gutierrez_Martinez_Nieva

## Trabajo Práctico — Herencia y Polimorfismo

**Tema:** Herencia y Polimorfismo

**Lenguaje:** Java

**Curso:** Programación II

---

## Integrantes

* **Galan, Natalia Anahi** — DNI 39917634
* **Gutiérrez Yañez, Gastón** — LU 2344
* **Martinez, Roberto Ariel Jesús** — LU 2372
* **Nieva, Tatiana Valeria** — LU 2348

---

# Descripción del trabajo

El presente trabajo práctico tiene como objetivo implementar en Java dos problemas utilizando los conceptos de **Programación Orientada a Objetos**, principalmente:

* Herencia
* Polimorfismo
* Clases abstractas
* Encapsulamiento
* Sobreescritura de métodos
* Colaboración entre objetos

Los problemas desarrollados son:

1. **Puerto**
2. **Batalla**

---

# 1. Puerto

## Enunciado

En un puerto se alquilan amarres para barcos de distinto tipo.

Para cada **ALQUILER** se guarda:

* Nombre del cliente.
* DNI del cliente.
* Fecha inicial del alquiler.
* Fecha final del alquiler.
* Posición del amarre.
* Barco que ocupará el amarre.

Un **BARCO** se caracteriza por:

* Matrícula.
* Eslora en metros.
* Año de fabricación.

El costo de un alquiler se calcula multiplicando:

```text
Número de días de ocupación
×
Módulo del barco
×
Valor fijo
```

El número de días incluye tanto el día inicial como el día final.

El módulo normal de un barco se obtiene multiplicando por 10 los metros de eslora.

Actualmente, el valor fijo es de **50.000**.

### Tipos especiales de barcos

Se diferencian algunos tipos de barcos:

* **Velero:** cantidad de mástiles.
* **Embarcación deportiva a motor:** potencia en CV.
* **Yate de lujo:** potencia en CV y cantidad de camarotes.

El módulo de cada tipo especial se obtiene como:

### Velero

```text
Módulo normal + cantidad de mástiles
```

### Deportivo a motor

```text
Módulo normal + potencia en CV
```

### Yate de lujo

```text
Módulo normal + potencia en CV + cantidad de camarotes
```

---

## Clases utilizadas

La clase principal es:

```text
Barco
```

De ella heredan:

```text
        Barco
       /  |  \
      /   |   \
Velero  DeportivoMotor  YateLujo
```

Además, la clase `Alquiler` mantiene una referencia a un objeto de tipo `Barco`, permitiendo trabajar con cualquier tipo de barco.

La clase `Puerto` administra los diferentes alquileres.

---

## Clases

### `Barco`

Representa un barco común.

### Atributos

* `matricula`
* `eslora`
* `anioFabricacion`

### Métodos principales

* `calcularModulo()`
* `mostrarDatos()`
* Getters

El método `calcularModulo()` calcula el módulo normal:

```text
10 × eslora
```

---

### `Velero`

Hereda de `Barco`.

Agrega el atributo:

```text
numeroMastiles
```

Sobreescribe:

```java
calcularModulo()
```

para agregar la cantidad de mástiles al módulo normal.

---

### `DeportivoMotor`

Hereda de `Barco`.

Agrega el atributo:

```text
potenciaCV
```

Sobreescribe:

```java
calcularModulo()
```

para agregar la potencia del motor al módulo normal.

---

### `YateLujo`

Hereda de `Barco`.

Agrega los atributos:

```text
potenciaCV
numeroCamarotes
```

Sobreescribe:

```java
calcularModulo()
```

para agregar la potencia y los camarotes al módulo normal.

---

### `Alquiler`

Representa el alquiler de un amarre.

Contiene información del cliente, las fechas, la posición del amarre y el barco.

### Métodos principales

```java
calcularDias()
calcularAlquiler()
mostrarAlquiler()
```

El método `calcularDias()` cuenta los días incluyendo la fecha inicial y final.

El método `calcularAlquiler()` utiliza el método:

```java
barco.calcularModulo()
```

Esto permite calcular el alquiler de cualquier tipo de barco.

---

### `Puerto`

Representa el puerto y contiene una lista de alquileres.

### Métodos principales

```java
agregarAlquiler()
mostrarAlquileres()
```

---

# 2. Batalla

## Enunciado

Definir la clase abstracta `Personaje` con los atributos:

* `vida`
* `nivelAtaque`
* `nivelDefensa`

y los métodos:

```java
atacar(): Integer
defender(Integer puntos)
```

Se debe implementar el método `atacar`, pero no el método `defender` en la clase `Personaje`.

Luego se crean dos clases hijas que implementan el método `defender` de manera diferente.

Cada clase debe establecer una cantidad de puntos de vida por defecto.

En cada ataque se realizan determinados puntos de daño y la defensa debe reducir esa cantidad.

Se deben realizar tres combates entre:

* `Guerrero`
* `Mago`

En cada combate, cada personaje realiza un ataque por turno.

El personaje que queda primero sin vida pierde.

Si la vida llega a un valor negativo, se debe mostrar el mensaje:

```text
Muerte
```

y establecer la vida en:

```text
0
```

La decisión de qué personaje ataca primero debe ser aleatoria.

---

# Clases utilizadas

La estructura de herencia es:

```text
             Personaje
            (abstracta)
              /    \
             /      \
            /        \
       Guerrero      Mago
```

---

## `Personaje`

Es una clase abstracta que representa a un personaje.

### Atributos

```text
vida
nivelAtaque
nivelDefensa
```

### Métodos

```java
atacar()
defender()
estaVivo()
getVida()
getNivelAtaque()
getNivelDefensa()
getNombre()
```

El método:

```java
atacar()
```

está implementado en la clase padre y devuelve el nivel de ataque.

El método:

```java
defender(Integer puntos)
```

es abstracto y debe ser implementado por las clases hijas.

---

## `Guerrero`

Hereda de `Personaje`.

Tiene valores por defecto para:

```text
Vida: 150
Nivel de ataque: 30
Nivel de defensa: 15
```

Implementa el método `defender()` de una manera particular.

El daño recibido se calcula utilizando el nivel de defensa del Guerrero.

---

## `Mago`

Hereda de `Personaje`.

Tiene valores por defecto para:

```text
Vida: 100
Nivel de ataque: 40
Nivel de defensa: 10
```

Implementa el método `defender()` de una manera diferente al Guerrero.

En este caso, el nivel de defensa tiene un efecto diferente sobre el daño recibido.

---

## `Batalla`

La clase `Batalla` se encarga de controlar el combate entre dos personajes.

Los personajes se almacenan utilizando el tipo:

```java
Personaje
```

Esto permite utilizar **polimorfismo**, ya que los objetos pueden ser un `Guerrero` o un `Mago`.

### Funciones principales

* Determinar aleatoriamente quién comienza.
* Realizar los ataques.
* Aplicar la defensa correspondiente.
* Controlar la vida de los personajes.
* Determinar cuándo termina el combate.
* Informar quién es el ganador.

El método:

```java
realizarAtaque()
```

hace colaborar al atacante y al defensor:

```text
Atacante
    |
    | atacar()
    ↓
Puntos de ataque
    |
    | defender()
    ↓
Defensor
```

---

# Herencia

La herencia se utiliza para evitar repetir los atributos y comportamientos comunes.

En la Parte 1:

```text
Barco
 ├── Velero
 ├── DeportivoMotor
 └── YateLujo
```

En la Parte 2:

```text
Personaje
 ├── Guerrero
 └── Mago
```

Las clases hijas reutilizan los atributos y métodos de sus clases padres y agregan o modifican lo necesario.

---

# Polimorfismo

El polimorfismo se utiliza principalmente en la Parte 2.

Por ejemplo:

```java
Personaje guerrero = new Guerrero();
Personaje mago = new Mago();
```

Aunque las variables son de tipo `Personaje`, contienen objetos diferentes.

También se utiliza:

```java
defensor.defender(puntosAtaque);
```

El método que se ejecuta depende del objeto que recibe el mensaje.

Si el defensor es un `Guerrero`, se ejecuta la implementación de `Guerrero`.

Si el defensor es un `Mago`, se ejecuta la implementación de `Mago`.

Esto permite enviar el mismo mensaje:

```java
defender()
```

a diferentes objetos y obtener un comportamiento diferente.

---

# Estructura del proyecto

```text
TP_Herencia_Polimorfismo/
│
├── Parte1Puerto/
│   │
│   ├── Main.java
│   ├── TestPuerto.java
│   ├── Puerto.java
│   ├── Alquiler.java
│   ├── Barco.java
│   ├── Velero.java
│   ├── DeportivoMotor.java
│   └── YateLujo.java
│
└── Parte2Batalla/
    │
    ├── Main.java
    ├── TestBatalla.java
    ├── Personaje.java
    ├── Guerrero.java
    ├── Mago.java
    └── Batalla.java
```

---

# Ejecución

## Parte 1 — Puerto

Para ejecutar el programa principal:

```text
Parte1Puerto → Main.java
```

El programa muestra un menú con opciones para:

1. Mostrar alquileres.
2. Crear alquiler de velero.
3. Crear alquiler de yate.
4. Salir.

Para realizar las pruebas:

```text
Parte1Puerto → TestPuerto.java
```

---

## Parte 2 — Batalla

Para ejecutar el programa principal:

```text
Parte2Batalla → Main.java
```

El menú permite:

1. Iniciar una batalla.
2. Realizar tres combates.
3. Salir.

Para realizar las pruebas:

```text
Parte2Batalla → TestBatalla.java
```

El test ejecuta tres combates independientes entre un `Guerrero` y un `Mago`.

---

# Tecnologías utilizadas

* **Java**
* **Programación Orientada a Objetos**
* **Herencia**
* **Polimorfismo**
* **Clases abstractas**
* **Sobreescritura de métodos**
* **ArrayList**
* **LocalDate**
* **Random**
* **Scanner**

---

# Conclusión

En este trabajo práctico se implementaron dos problemas utilizando conceptos fundamentales de la Programación Orientada a Objetos.

En la primera parte se utilizó la **herencia** para representar los diferentes tipos de barcos y permitir que cada uno pueda calcular su módulo de manera particular.

En la segunda parte se utilizó una clase abstracta `Personaje` y dos clases hijas, `Guerrero` y `Mago`, que implementan de manera diferente el método `defender()`.

De esta manera se aplicaron los conceptos de **herencia y polimorfismo**, permitiendo que diferentes objetos respondan de forma distinta ante un mismo mensaje.
