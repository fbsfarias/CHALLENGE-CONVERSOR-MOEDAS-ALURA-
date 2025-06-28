package br.com.alura.modules;
import java.util.Map;

public record Moeda(String base_code, Map<String, Double> conversion_rates) {
}
