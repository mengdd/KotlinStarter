package com.ddmeng.injection.component

import com.ddmeng.injection.PerFragment
import com.ddmeng.injection.module.FragmentModule
import dagger.Subcomponent

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = [FragmentModule::class])
interface FragmentComponent