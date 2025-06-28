# CHALLENGE-CONVERSOR-MOEDAS-ALURA-


Este projeto é um **Conversor de Moeda** desenvolvido como parte do programa [Oracle Next Education](https://www.oracle.com/br/education/oracle-next-education/) (ONE), em parceria com a [Alura](https://www.alura.com.br/).

O desafio teve como principal objetivo criar uma aplicação de conversão de moedas utilizando Java, boas práticas de programação orientada a objetos, e consumo de API externa.

---

## 🎯 Objetivo do projeto

- Criar um conversor que consulte taxas de câmbio em tempo real por meio de uma API pública.
- Permitir que o usuário converta valores entre diferentes moedas.
- Aplicar conceitos de:
    - Programação orientada a objetos (POO)
    - Consumo de API REST
    - Boas práticas de encapsulamento
    - Separação de responsabilidades em diferentes classes

---

## 🚀 Funcionalidades implementadas

✅ Consulta em tempo real das taxas de câmbio pela API ExchangeRate-API  
✅ Conversão automática de valores com base na taxa atual  
✅ Registro da data e hora da conversão usando `java.time`  
✅ Interface de texto interativa para o usuário digitar:
- Código da moeda base (ex.: USD)
- Código da moeda destino (ex.: BRL)
- Valor desejado

---

## ✨ Melhorias e novidades implementadas

Durante o desenvolvimento, foram adicionadas algumas melhorias que **não estavam no escopo inicial**, incluindo:

🌟 **Escolha livre de moedas**
- Antes, a aplicação utilizava um `switch-case` fixo com opções pré-definidas de conversão (ex.: Dólar para Real).
- Foi removido o menu rígido e substituído por entrada de dados livre, permitindo converter entre **qualquer moeda suportada pela API**.

🌟 **Registro da data e hora**
- Foi implementado o uso do pacote `java.time` (`LocalDateTime`) para registrar e exibir a data e hora em que cada conversão foi realizada.

🌟 **Separação clara de responsabilidades**
- O código foi modularizado em classes:
    - `Menu`: interação com o usuário.
    - `ConsultaConvercao`: requisição HTTP e leitura da API.
    - `ConversorMoeda`: lógica de conversão.
    - `Moeda`: representação do JSON retornado.
    - `Main`: orquestração do fluxo.

🌟 **Estrutura limpa e extensível**
- Projeto organizado em pacotes com **responsabilidade única por classe**, facilitando manutenção e testes.

---

## 📂 Estrutura do projeto

src/
├── br/
│ └── com/
│ └── alura/
│ └── modules/
│ ├── Moeda.java
│ ├── ConsultaConvercao.java
│ ├── ConversorMoeda.java
│ └── Menu.java
└── Main.java



---

## 🛠️ Tecnologias e bibliotecas utilizadas

- **Java 17**
- **Gson** para desserialização do JSON retornado pela API
- **HttpClient** (Java padrão) para requisições HTTP
- **java.time.LocalDateTime** para registro do horário das conversões

---

## 👨‍💻 Como executar o projeto

1. **Clone o repositório**:

git clone <https://github.com/fbsfarias/CHALLENGE-CONVERSOR-MOEDAS-ALURA->


2. **Abra no seu IDE** (IntelliJ, Eclipse, VS Code...)

3. **Certifique-se de ter o Gson na sua build path** (ou adicione ao `pom.xml` caso use Maven).

4. **Execute a classe `Main`**.

5. **Siga as instruções no console** para digitar:
- Moeda base
- Moeda destino
- Valor a converter

---

## 🙏 Agradecimentos

Este projeto foi desenvolvido como parte do **Challenge ONE - Java - Back end**, no programa **Oracle Next Education** em parceria com a **Alura**.

Muito obrigado à Oracle e à Alura pela oportunidade de aprendizado e evolução profissional!

---



