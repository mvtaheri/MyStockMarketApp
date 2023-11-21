package com.vahid.mystockmarketapp.presentation.company_info

import com.vahid.mystockmarketapp.domain.model.CompanyInfo
import com.vahid.mystockmarketapp.domain.model.IntradayInfo
import com.vahid.mystockmarketapp.domain.repository.StockRepository

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
