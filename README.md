README.md
# 💱 Conversor de Moedas - Challenge Alura ONE

Este projeto é um **Conversor de Moedas desenvolvido em Java**, criado como solução para o desafio **Oracle Next Education (ONE) + Alura** na trilha de Back-End.

O programa permite que o usuário converta valores entre diferentes moedas utilizando uma API de câmbio, exibindo o resultado diretamente no console.
# 🏆 Challenge Oracle Next Education

Projeto desenvolvido como parte do programa:

Oracle Next Education (ONE) + Alura

Voltado para formação de desenvolvedores Back-End com Java.

---

# 📌 Objetivo do Projeto

O objetivo deste projeto é praticar conceitos fundamentais de desenvolvimento Back-End com **Java**, incluindo:

- Consumo de API
- Manipulação de JSON
- Orientação a Objetos
- Tratamento de exceções
- Interação com o usuário via console

Este desafio faz parte da formação **Java e Orientação a Objetos do programa Oracle Next Education (ONE)**.

---

# 🚀 Funcionalidades

✔ Conversão entre diferentes moedas  
✔ Consulta de taxas de câmbio através de API  
✔ Interface via terminal (console)  
✔ Estrutura orientada a objetos  
✔ Tratamento de erros e exceções  

Exemplo de conversão:


USD → BRL<br>
EUR → BRL<br>
EUR → USD<br>
E muito mais!


---

# 🛠 Tecnologias Utilizadas

- Java
- Maven
- API de Câmbio
- Biblioteca Gson (para leitura de JSON)
- Programação Orientada a Objetos

---

# 📂 Estrutura do Projeto

```bash
challenge-conversor-de-moedas-alura-one
│
├── src
│ ├── Main.java
│ ├── ConversorAPI.java
│ ├── Moedas.java
│ └── outros arquivos...
│
├── pom.xml
├── .gitignore
└── README.md
```

---

# ⚙️ Como Executar o Projeto



1️⃣ Clonar o repositório
```bash
git clone https://github.com/devbeafg/challenge-conversor-de-moedas-alura-one.git
```


2️⃣ Entrar na pasta do projeto
```bash
cd challenge-conversor-de-moedas-alura-one
```


3️⃣ Abrir em uma IDE Java

Recomendado:

IntelliJ IDEA

Eclipse

VSCode


4️⃣ Instalar dependências Maven

Se sua IDE não baixar automaticamente:
```bash
mvn install
```

5️⃣ Executar o programa

Execute o arquivo:

Main.java

# 🖥 Exemplo de Uso

Quando o programa inicia, o usuário deve informar:

1️⃣ A moeda desejada<br>
2️⃣ O valor a ser convertido

Exemplo:

Digite a sigla da moeda:
USD

Digite o valor a ser convertido:
100

Saída esperada:

Valor convertido: 520.30 BRL
###📡 Integração com API

O sistema utiliza uma API de câmbio para buscar os valores atualizados das moedas.

Fluxo:

Usuário → API → JSON → Conversão → Resultado no Console

# 📚 Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

Consumo de API em Java

Parsing de JSON com Gson

Estruturação de classes

Boas práticas de organização de código

Tratamento de exceções

# 🔮 Possíveis Melhorias

Interface gráfica (JavaFX ou Swing)

Histórico de conversões

Suporte para mais moedas

Menu interativo

Testes automatizados


