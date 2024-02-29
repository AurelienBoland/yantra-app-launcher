package com.coderGtm.yantra.commands.weather

import android.graphics.Typeface
import com.android.volley.NoConnectionError
import com.android.volley.VolleyError
import com.coderGtm.yantra.R
import org.json.JSONObject
import kotlin.math.roundToInt

fun handleResponse(response: String, command: Command, location: String) {
    command.output("-------------------------")
    command.output(command.terminal.activity.getString(R.string.weather_report_of, location), command.terminal.theme.successTextColor, Typeface.BOLD)
    val json = JSONObject(response)
    val weather = json.getJSONArray("weather").getJSONObject(0).getString("main")
    val temp = json.getJSONObject("main").getString("temp")
    val minTemp = json.getJSONObject("main").getString("temp_min")
    val maxTemp = json.getJSONObject("main").getString("temp_max")
    val humidity = json.getJSONObject("main").getString("humidity")
    val windSpeed = json.getJSONObject("wind").getString("speed").toFloat()
    val tempC = temp.toFloat().roundToInt() - 273
    command.output("=> $weather")
    command.output("=> Temperature: $tempC°C (${tempC*9/5 +32}°F)")
    command.output("=> Min: ${minTemp.toFloat().roundToInt() - 273}°C (${minTemp.toFloat().roundToInt().minus(273) * 9/5 +32}°F)")
    command.output("=> Max: ${maxTemp.toFloat().roundToInt() - 273}°C (${maxTemp.toFloat().roundToInt().minus(273 ) * 9/5 +32}°F)")
    command.output("=> Humidity: $humidity%")
    command.output("=> Wind: ${(windSpeed * 3.6).roundToInt()} kmph")
    command.output("-------------------------")
}

fun handleError(error: VolleyError, command: Command) {
    if (error is NoConnectionError) {
        command.output(command.terminal.activity.getString(R.string.no_internet_connection), command.terminal.theme.errorTextColor)
    }
    //handle 404 error
    else if (error.networkResponse.statusCode == 404) {
        command.output(command.terminal.activity.getString(R.string.location_not_found), command.terminal.theme.warningTextColor)
    }
    else {
        command.output(command.terminal.activity.getString(R.string.an_error_occurred_no_reason),command.terminal.theme.errorTextColor)
    }
}