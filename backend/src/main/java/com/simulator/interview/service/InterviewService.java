package com.simulator.interview.service;

import com.simulator.interview.model.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InterviewService {

    @Value("${openai.api.key}")
    private String openAIApiKey;

    public String generateQuestion(String stack, String framework, String level) {
        // Exemplo de chamada para API OpenAI
        String prompt = String.format("Crie uma pergunta de nível %s sobre %s para um desenvolvedor %s.",
                level, framework, stack);

        RestTemplate restTemplate = new RestTemplate();
        // Configurar a chamada para OpenAI usando a API Key
        // Isso pode ser implementado com HttpHeaders e body JSON.

        // Retornar a pergunta gerada
        return "Pergunta gerada pela API (simulada aqui)";
    }
}
