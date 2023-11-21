package com.vahid.mystockmarketapp.di

import com.vahid.mystockmarketapp.data.csv.CSVParser
import com.vahid.mystockmarketapp.data.csv.CompanyListingParser
import com.vahid.mystockmarketapp.data.csv.IntradayInfoParser
import com.vahid.mystockmarketapp.data.repository.StockRepositoryImp
import com.vahid.mystockmarketapp.domain.model.CompanyListing
import com.vahid.mystockmarketapp.domain.model.IntradayInfo
import com.vahid.mystockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindCompanyListingParser(
        companyListingParser: CompanyListingParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockReposirotyImpl: StockRepositoryImp
    ): StockRepository

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        IntradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>
}