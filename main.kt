import java.net.HttpURLConnection
import java.net.URL
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val apiUrl = "https://example.com/api" // API'nin URL'si

    try {
        // URL'yi oluştur
        val url = URL(apiUrl)
        
        // HttpURLConnection oluştur
        val connection = url.openConnection() as HttpURLConnection
        
        // GET isteği yap
        connection.requestMethod = "GET"
        
        // Yanıtı oku
        val responseCode = connection.responseCode
        if (responseCode == HttpURLConnection.HTTP_OK) {
            val reader = BufferedReader(InputStreamReader(connection.inputStream))
            var line: String?
            val response = StringBuilder()

            while (reader.readLine().also { line = it } != null) {
                response.append(line)
            }

            reader.close()
            
            // API yanıtı response.toString() içinde bulunabilir
            println("API Yanıtı: $response")
        } else {
            println("API isteği başarısız. Hata kodu: $responseCode")
        }

        // Bağlantıyı kapat
        connection.disconnect()

    } catch (e: Exception) {
        e.printStackTrace()
    }
}
