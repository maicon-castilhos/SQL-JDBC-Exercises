# 🗄️ SQL & JDBC Exercises

Repositório dedicado aos meus exercícios de conexão entre Java e banco de dados, usando **JDBC puro** (sem frameworks como Hibernate/JPA), criado para praticar SQL, modelagem relacional e integração de aplicações Java com MySQL.

## 📌 Sobre

Aqui você encontrará exercícios e pequenos projetos que exploram desde queries SQL básicas até a estruturação de uma camada de acesso a dados (DAO) em Java, conectando aplicações reais a um banco de dados relacional.

## 🛠️ Tecnologias

- **Java** (JDK 17+)
- **JDBC** (java.sql)
- **MySQL** 8.0
- **MySQL Workbench** (modelagem e consultas)
- [IDE utilizada, ex: IntelliJ IDEA / Eclipse]

- Cada pasta contém o código Java, o script SQL correspondente (`.sql`) e um `db.properties.example` mostrando o formato esperado do arquivo de configuração (sem credenciais reais).

## 🚀 Como executar

### 1. Configure o banco de dados
Crie um banco no MySQL Workbench e rode o script `.sql` da pasta do exercício desejado.

### 2. Configure a conexão
Copie o arquivo de exemplo e preencha com suas credenciais:
```bash
cp db.properties.example db.properties
```
```properties
db.url=jdbc:mysql://localhost:3306/nome_do_banco
user=root
password=sua_senha_aqui
```

### 3. Compile e execute
```bash
javac -d bin src/**/*.java
java -cp bin;lib/mysql-connector-j.jar program.Main
```

## 🧠 Conceitos praticados

- Conexão JDBC (`Connection`, `Statement`, `PreparedStatement`, `ResultSet`)
- Tratamento de exceções customizado (`DbException`)
- Modelagem de banco relacional (chave primária, chave estrangeira)
- Padrão DAO (Data Access Object)
- Mapeamento de `enum` Java para colunas do banco
- Streams e Optional aplicados sobre dados vindos do banco

## 📈 Progresso

- [x] Conexão básica com o banco (DB.java)
- [x] SELECT simples e leitura de ResultSet
- [x] INSERT, UPDATE, DELETE com PreparedStatement
- [ ] Camada DAO completa
- [ ] Relacionamentos com JOIN
- [ ] Projeto prático com persistência real

## ⚠️ Segurança

O arquivo `db.properties` contendo credenciais reais **não é versionado** (está no `.gitignore`). Apenas um arquivo de exemplo (`db.properties.example`) é mantido no repositório.

## 🤝 Contribuições

Este é um repositório pessoal de estudos, mas sugestões e feedbacks são sempre bem-vindos! Sinta-se à vontade para abrir uma *issue*.

## 📄 Licença

Este projeto está sob a licença MIT — sinta-se livre para usar como referência nos seus próprios estudos.

---

⭐ Se este repositório te ajudou de alguma forma, considere deixar uma estrela!
