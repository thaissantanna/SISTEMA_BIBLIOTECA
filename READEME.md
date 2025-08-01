# 📚✨ Sistema de Biblioteca em Kotlin

![Kotlin](https://img.shields.io/badge/Kotlin-1.9.10-blueviolet?logo=kotlin&logoColor=white)
![SQLite](https://img.shields.io/badge/SQLite-3.42.0-003B57?logo=sqlite&logoColor=white)
![API REST](https://img.shields.io/badge/API-Ktor-0095D5?logo=ktor&logoColor=white)
![Status](https://img.shields.io/badge/Feito%20com-Dedica%C3%A7%C3%A3o%20e%20Caf%C3%A9-%23f5a623)

> 🎓 Projeto de estudo orientado por um arquiteto de soluções — com visão profissional e execução de estudante comprometida. 💪

---

## 🎯 Objetivo

Este projeto tem como objetivo criar um **sistema completo de gerenciamento de biblioteca**, com:

- 🧱 **Arquitetura limpa**
- ⚙️ Camadas bem definidas (`domain`, `service`, `data`, `api`)
- 💾 Persistência com **SQLite**
- 🌐 API RESTful com **Ktor**
- 🧪 Estrutura pronta para testes e extensão

---

## 🔧 Tecnologias utilizadas

| Tecnologia   | Versão   | Função Principal             |
|--------------|----------|------------------------------|
| Kotlin       | 1.9+     | Linguagem principal          |
| Gradle       | 8+       | Gerenciador de build         |
| SQLite       | 3.42.0   | Banco de dados local         |
| Ktor         | 2.3+     | Framework RESTful HTTP       |
| JDBC         | -        | Conexão com o SQLite         |

---

## 🌐 Endpoints (em breve)

- `GET /clients` → Lista todos os clientes
- `POST /clients` → Cadastra novo cliente
- ... (catalog, loans, inventory...)

---

## 🚀 Como rodar o projeto

```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/biblioteca-kotlin.git
cd biblioteca-kotlin

# 2. Rode o projeto com o Gradle Wrapper
./gradlew run
