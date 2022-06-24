package edu.itsco.harrypotterclient.data.repository

import edu.itsco.harrypotterclient.data.api.HarryPotterApi
import javax.inject.Inject
import edu.itsco.harrypotterclient.data.api.model.Character

class HarryPotterRepository @Inject constructor(
    private val HarryPotterApi: HarryPotterApi
) {

    suspend fun getCharacters(): Character {
        return HarryPotterApi.getCharacters()
    }
}
