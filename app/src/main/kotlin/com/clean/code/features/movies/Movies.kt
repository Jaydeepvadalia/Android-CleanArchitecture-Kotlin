package com.clean.code.features.movies

import com.clean.code.core.Feature
import com.clean.code.features.movies.data.MoviesRepository
import com.clean.code.features.movies.data.MoviesService
import com.clean.code.features.movies.interactor.GetMovieDetails
import com.clean.code.features.movies.interactor.GetMovies
import com.clean.code.features.movies.interactor.PlayMovie
import com.clean.code.features.movies.ui.MovieDetailsViewModel
import com.clean.code.features.movies.ui.MoviesViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

fun moviesFeature() = object : Feature {

    override fun name() = "movies"

    override fun diModule() = module {
        // Movies Feature
        factoryOf(::MoviesService)
        factory { MoviesRepository.Network(get(), get()) } bind MoviesRepository::class
        // Movies
        viewModelOf(::MoviesViewModel)
        factoryOf(::GetMovies)
        // Movie Details
        viewModelOf(::MovieDetailsViewModel)
        factoryOf(::GetMovieDetails)
        factoryOf(::PlayMovie)
    }
}
