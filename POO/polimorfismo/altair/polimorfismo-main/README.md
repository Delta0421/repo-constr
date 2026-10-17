# Polimorfismo — soluciones de referencia

Implementaciones completas del ejercicio de **Polimorfismo** (paramétrico, de subtipo
y ad-hoc) en cuatro lenguajes: C++, Java, C# y Python.

Cada carpeta contiene una clase abstracta `Contenedor<T>`, su implementación concreta
`MiVector<T>`, y los cinco tests que verifican los tres tipos de polimorfismo.
Compila y corre de forma independiente, sin dependencias entre carpetas.

Ejercicio interactivo (editor en el navegador, sin instalar nada):
**https://polimorfismo.heimdall-lab.com**

## Estructura

```
.
├── cpp/       Contenedor.hpp, MiVector.hpp, 5 tests, test_utils.hpp
├── java/      Contenedor.java, MiVector.java, 5 tests, TestUtils.java
├── csharp/    Contenedor.cs, MiVector.cs, 5 tests, TestUtils.cs
└── python/    mivector.py, 5 tests, test_utils.py
```

## Los cinco tests

| # | Test | Qué demuestra |
|---|---|---|
| 1 | La interfaz | Una clase abstracta y una concreta que la implementa |
| 2 | Construcción | Agregar elementos y recorrerlos |
| 3 | Polimorfismo de subtipo | Una referencia al tipo base ejecuta el método sobrescrito |
| 4 | Polimorfismo paramétrico | El mismo contenedor funciona con tres tipos distintos |
| 5 | Polimorfismo ad-hoc | Sobrecarga de operadores y de constructores |

## Cómo correr los tests

Cada test es un programa independiente con su propio punto de entrada — compila uno a
la vez, no la carpeta completa.

**C++**
```sh
g++ -std=c++17 -I. cpp/01_test_interfaz.cpp -o test && ./test
```

**Java**
```sh
javac java/*.java -d out && java -cp out Test01Interfaz
```

**C#**
```sh
mkdir build && cp csharp/{Contenedor.cs,MiVector.cs,TestUtils.cs,Test01Interfaz.cs,app.csproj} build/
cd build && dotnet run
```

**Python**
```sh
python3 python/test01_interfaz.py
```
