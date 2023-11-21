package com.vahid.mystockmarketapp.domain.repository

import com.vahid.mystockmarketapp.data.local.CompanyListingEntity
import com.vahid.mystockmarketapp.domain.model.CompanyInfo
import com.vahid.mystockmarketapp.domain.model.CompanyListing
import com.vahid.mystockmarketapp.domain.model.IntradayInfo
import com.vahid.mystockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListing(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}