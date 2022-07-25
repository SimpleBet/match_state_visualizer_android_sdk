package io.simplebet.games.visualizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val matchVisualizerConfiguration = MatchVisualizerConfiguration()
        matchVisualizerConfiguration
            .setAPIKey("YOUR_API_KEY")
            .setTeams(listOf(Teams.Nfl.getTeamIdByAbbreviation(thereModel.abbreviation), Teams.nfl.Boston))
            .setLeague("MLB")
            .setStartTime(SimpleDateFormat.getDateTimeInstance().format(Date()));

        val matchVisualizer = findViewById<MatchStateVisualizerView>(R.id.visualizer)
        matchVisualizer.setMatchConfiguration(matchVisualizerConfiguration)

        MatchStateVisualizer.sendAnalytics("play", HashMap<String, String>())
    }
}