package br.com.docesmarias.pagamentos.dto;

import br.com.docesmarias.pagamentos.model.ItemDoPedido;
import br.com.docesmarias.pagamentos.model.Status;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class PagamentoDto {

    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long formaDePagamentoId;
    private Long pedidoId;
    private List<ItemDoPedido> itens;

}
