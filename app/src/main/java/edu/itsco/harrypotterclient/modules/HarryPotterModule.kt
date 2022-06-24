package edu.itsco.harrypotterclient.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.itsco.harrypotterclient.data.api.ApiConstants
import edu.itsco.harrypotterclient.data.api.HarryPotterApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HarryPotterModule {

    @Provides
    @Singleton
    fun getHarryPotterApi(): HarryPotterApi{
        return Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(HarryPotterApi::class.java)
    }
}