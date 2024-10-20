import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ApiMonedaService {

    private static final String API_KEY = "a37b6605bca6032822a24600"; // Sustituir con tu clave de API
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";

    // Método para obtener la tasa de cambio entre dos monedas
    public TasaCambio obtenerTasaCambio(String base, String destino) throws Exception {
        String urlString = API_URL + API_KEY + "/pair/" + base + "/" + destino;
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        // Parseamos la respuesta JSON
        JSONObject jsonResponse = new JSONObject(response.toString());
        if (jsonResponse.getString("result").equals("success")) {
            double tasa = jsonResponse.getDouble("conversion_rate");
            return new TasaCambio(base, destino, tasa);
        } else {
            throw new Exception("Error en la conversión: " + jsonResponse.getString("error-type"));
        }
    }
}
