package com.tantrus332.bankcards.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tantrus332.bankcards.dto.BankCardDetailsDto;
import com.tantrus332.bankcards.dto.BankCardDto;
import com.tantrus332.bankcards.dto.BankCardUpdateDto;
import com.tantrus332.bankcards.dto.TransferResponseDto;

public interface BankCardService {
    public BankCardDto get(Long id);
    public BankCardDto create(Long ownerUserId);

    public Page<BankCardDto> getMyCards(Pageable pageable, String cardNumberLast4);
    public Page<BankCardDto> getAll(Pageable pageable, String cardNumberLast4);
    public Page<BankCardDto> getCardsWithBlockRequest(Pageable pageable, String cardNumberLast4);

    public BankCardDto update(Long cardId, BankCardUpdateDto bankCardStoreDto);
    public void delete(Long id);

    public BankCardDto activate(Long cardId);
    public BankCardDto requestBlock(Long cardId);
    public BankCardDto confirmBlock(Long cardId);

    public TransferResponseDto transfer(String fromCardNumber, String toCardNumber, BigDecimal amount);
    public BankCardDetailsDto getFullDetails(Long cardId);
}
