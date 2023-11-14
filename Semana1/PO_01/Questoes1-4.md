# 1. O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.

Em Java, uma classe é uma estrutura que define o comportamento e as propriedades de objetos. Um objeto é uma instância de uma classe. Aqui estão cinco exemplos em C++ e Java:

Exemplo em C++:

// C++ Exemplo 1
class Car {
  // propriedades e métodos
};

// C++ Exemplo 2
class Circle {
  // propriedades e métodos
};

// C++ Exemplo 3
class Person {
  // propriedades e métodos
};

// C++ Exemplo 4
class Animal {
  // propriedades e métodos
};

// C++ Exemplo 5
class Book {
  // propriedades e métodos
};

Exemplo em Java:

// Java Exemplo 1
class Carro {
  // propriedades e métodos
}

// Java Exemplo 2
class Circulo {
  // propriedades e métodos
}

// Java Exemplo 3
class Pessoa {
  // propriedades e métodos
}

// Java Exemplo 4
class Animal {
  // propriedades e métodos
}

// Java Exemplo 5
class Livro {
  // propriedades e métodos
}

# 2. Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++.

Em Java, a declaração de variáveis envolve a indicação do tipo de dado, seguido pelo nome da variável. Tipos primitivos comuns incluem int, float, double, boolean, char, etc. Em C++, a sintaxe é semelhante.

Exemplo em Java: 

// Declaração de variável em Java
int idade = 25;
float salario = 3000.50f;
boolean isAdulto = true;
char inicial = 'A';

Exemplo em C++:

// Declaração de variável em C++
int idade = 25;
float salario = 3000.50;
bool isAdulto = true;
char inicial = 'A';

# 3. Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos. 

Em Java, a herança permite que uma classe herde propriedades e métodos de outra classe. Para criar uma subclasse se utiliza a palavra-chave 'extends'. Em C++, a herança é implementada usando 'class Subclasse : public ClasseBase'.

Exemplo em Java:

// Classe base em Java
class Animal {
  void fazerSom() {
    System.out.println("Som genérico");
  }
}

// Subclasse em Java
class Gato extends Animal {
  void fazerSom() {
    System.out.println("Miau");
  }
}

Exemplo em C++:

// Classe base em C++
class Animal {
public:
  void fazerSom() {
    cout << "Som genérico" << endl;
  }
};

// Subclasse em C++
class Gato : public Animal {
public:
  void fazerSom() {
    cout << "Miau" << endl;
  }
};


# 4. Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto. 

Em Java, não há manipulação direta de ponteiros como em C++. Em Java, as variáveis de objeto contêm referências aos objetos, mas não ponteiros diretos. Em C++, você pode usar ponteiros para manipular diretamente a memória

Exemplo em C++:

int* ponteiro = new int;
*ponteiro = 42;
delete ponteiro; // liberar memória

// Em Java, não há manipulação direta de ponteiros.
// As referências são gerenciadas automaticamente pelo coletor de lixo.




