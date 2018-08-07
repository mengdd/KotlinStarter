package com.ddmeng.injection.component

import com.ddmeng.injection.PerActivity
import com.ddmeng.injection.module.ActivityModule
import com.ddmeng.features.base.BaseActivity
import com.ddmeng.features.detail.DetailActivity
import com.ddmeng.features.main.MainActivity
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(baseActivity: BaseActivity)

    fun inject(mainActivity: MainActivity)

    fun inject(detailActivity: DetailActivity)
}
