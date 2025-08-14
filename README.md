# 📋 Cadastro de Tarefas

[![GitHub Repo](https://img.shields.io/badge/GitHub-Cadastro__tarefas-black?logo=github&style=for-the-badge)](https://github.com/EmmanuelGomesSilva/Cadastro_tarefas)
[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)

Um sistema simples em Java para cadastrar, listar, buscar, marcar como concluídas e remover tarefas diretamente no terminal.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia | Ícone |
|------------|-------|
| Java 17+   | ![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) |
| Git        | ![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white) |
| GitHub     | ![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white) |



## 📜 Funcionalidades
- ✅ Cadastrar tarefa com **ID**, **descrição**, **data limite** e **status**.
- 📄 Listar todas as tarefas.
- ✔️ Marcar tarefa como concluída.
- 🗑 Remover tarefa por ID.
- 🔍 Buscar tarefa por palavra-chave na descrição.
---

## 📂 Estrutura do Projeto
```
Cadastro_tarefas/
├── src/
│ └── com/
│ └── emmanuel/
│ ├── main/ # Classe Main
│ ├── model/ # Modelos (Tarefas, Status)
│ ├── repository/ # Repositório de dados
│ └── service/ # Lógica de negócio
└── README.md
```


## 💻 Como Executar
1. **Clonar o repositório**
```bash
git clone https://github.com/EmmanuelGomesSilva/Cadastro_tarefas.git
```
2. **Acessar a pasta do projeto**
```bash
cd Cadastro_tarefas
```
3. **Compilar o código**
```bash
javac -d bin src/com/emmanuel/model/*.java src/com/emmanuel/repository/*.java src/com/emmanuel/service/*.java src/com/emmanuel/main/*.java
```
4. **Executar o programa**
```bash
java -cp bin com.emmanuel.main.Main
```

## 👨‍💻 Autor

**Emmanuel Gomes Silva**  
📌 [GitHub](https://github.com/EmmanuelGomesSilva)
