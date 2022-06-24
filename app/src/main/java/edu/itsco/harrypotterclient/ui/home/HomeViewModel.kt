package edu.itsco.harrypotterclient.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.itsco.harrypotterclient.data.api.model.CharacterItem
import edu.itsco.harrypotterclient.data.repository.HarryPotterRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val harryPotterRepository: HarryPotterRepository
): ViewModel() {
    private val _state = MutableStateFlow(emptyList<CharacterItem>())
    val state: StateFlow<List<CharacterItem>>
        get() = _state

    init {
        viewModelScope.launch {
            _state.value = harryPotterRepository.getCharacters()
        }
    }
}