package edu.itsco.harrypotterclient.data.api

import edu.itsco.harrypotterclient.data.api.model.CharacterItem
import retrofit2.http.GET
import edu.itsco.harrypotterclient.data.api.model.Character

interface HarryPotterApi {

    @GET("characters")
    suspend fun getCharacters(): Character
}