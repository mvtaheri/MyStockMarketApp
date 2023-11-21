package com.vahid.mystockmarketapp.data.mapper

import com.vahid.mystockmarketapp.data.local.CompanyListingEntity
import com.vahid.mystockmarketapp.data.remote.dto.CompanyInfoDto
import com.vahid.mystockmarketapp.domain.model.CompanyInfo
import com.vahid.mystockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}
