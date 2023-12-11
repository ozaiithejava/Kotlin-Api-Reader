## Kotlin Api Reader

Buraya proje hakkında kısa bir açıklama ekleyebilirsiniz.

### API İsteği Örneği

Aşağıda, belirtilen API URL'sine GET isteği gönderen basit bir Kotlin kodu bulunmaktadır.

```kotlin
import java.net.HttpURLConnection
import java.net.URL
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val apiUrl = "https://example.com/api" // API'nin URL'si

    try {
        // Kodu buraya ekleyin
        // ...

    } catch (e: Exception) {
        e.printStackTrace()
    }
}
