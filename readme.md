# DevInterviewSimulator

## 📖 Sobre o projeto
O **DevInterviewSimulator** é uma ferramenta interativa que permite aos desenvolvedores se prepararem para entrevistas técnicas com base nas tecnologias e frameworks que eles dominam. O sistema gera perguntas dinâmicas e simula uma entrevista real, fornecendo feedback instantâneo e explicações sobre as respostas.

### Funcionalidades:
- **Simulador de entrevista**: O desenvolvedor escolhe sua stack (frontend, backend, low code, etc.) e os frameworks que conhece. O sistema gera perguntas específicas para essa configuração.
- **Quiz de Perguntas Rápidas**: Um quiz dinâmico com perguntas sobre frameworks e tecnologias, ajudando a testar e reforçar o conhecimento.
- **Integração com IA**: O projeto utiliza IA para criar perguntas relevantes com base nos frameworks escolhidos e oferecer respostas quando o usuário não souber a resposta correta.

---

## 🛠 Tecnologias utilizadas

- **Backend**:
    - Java 17
    - Spring Boot 3.1.4
    - Maven
    - Spring Data JPA
    - Banco de dados H2 (para simulação simples)

- **Frontend**:
    - React
    - JavaScript (ES6+)
    - Axios (para fazer requisições ao backend)

- **Integração com IA**:
    - OpenAI API (para gerar perguntas dinâmicas e fornecer respostas quando necessário)

---

## ⚙️ Como rodar o projeto

### Backend
1. Navegue até a pasta do backend:
    ```bash
    cd backend
    ```

2. Instale as dependências e inicie o projeto com Maven:
    ```bash
    mvn install
    mvn spring-boot:run
    ```

3. O backend estará disponível em [http://localhost:8080](http://localhost:8080).

### Frontend
1. Navegue até a pasta do frontend:
    ```bash
    cd frontend
    ```

2. Instale as dependências:
    ```bash
    npm install
    ```

3. Inicie o servidor de desenvolvimento:
    ```bash
    npm start
    ```

4. O frontend estará disponível em [http://localhost:3000](http://localhost:3000).

---

## 📝 Como contribuir

1. Faça um fork do projeto.
2. Crie uma branch para a sua feature (`git checkout -b feature/MinhaFeature`).
3. Comite suas alterações (`git commit -am 'Add new feature'`).
4. Envie para o repositório remoto (`git push origin feature/MinhaFeature`).
5. Crie um pull request.

---

## 📄 Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 💬 Contato

Se você tiver sugestões ou quiser contribuir para o projeto, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

---

## 📌 Roadmap
- Melhorias na interface do usuário.
- Adicionar mais frameworks e stacks ao sistema de perguntas.
- Suporte a diferentes tipos de perguntas (ex: múltipla escolha, código para completar, etc.).
