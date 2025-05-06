package com.gessicameireles.CardapioDigital.dto;

import com.gessicameireles.CardapioDigital.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
