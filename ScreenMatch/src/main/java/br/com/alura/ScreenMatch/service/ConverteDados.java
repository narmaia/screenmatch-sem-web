package br.com.alura.ScreenMatch.service;

import br.com.alura.ScreenMatch.model.DadosSeries;
import tools.jackson.databind.ObjectMapper;

public class ConverteDados extends IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        return mapper.readValue(json, classe);
    }


}
