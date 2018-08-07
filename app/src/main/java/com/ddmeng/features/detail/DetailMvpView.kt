package com.ddmeng.features.detail

import com.ddmeng.data.model.Pokemon
import com.ddmeng.data.model.Statistic
import com.ddmeng.features.base.MvpView

interface DetailMvpView : MvpView {

    fun showPokemon(pokemon: Pokemon)

    fun showStat(statistic: Statistic)

    fun showProgress(show: Boolean)

    fun showError(error: Throwable)

}