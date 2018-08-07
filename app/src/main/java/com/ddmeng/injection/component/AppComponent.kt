package com.ddmeng.injection.component

import android.app.Application
import android.content.Context
import dagger.Component
import com.ddmeng.data.DataManager
import com.ddmeng.data.remote.PokemonApi
import com.ddmeng.injection.ApplicationContext
import com.ddmeng.injection.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    @ApplicationContext
    fun context(): Context

    fun application(): Application

    fun dataManager(): DataManager

    fun pokemonApi(): PokemonApi
}
