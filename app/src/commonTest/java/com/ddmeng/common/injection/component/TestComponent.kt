package com.ddmeng.common.injection.component

import dagger.Component
import com.ddmeng.common.injection.module.ApplicationTestModule
import com.ddmeng.injection.component.AppComponent
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationTestModule::class))
interface TestComponent : AppComponent