package com.assistencia.helpdesk.atendimento.enums;

public enum StatusOS {

        AGUARDA_ORC(0, "Aguardando Orçamento"),
        AGUARDA_APR (1, "Orçamento Realizado - Aguardando Aprovação"),
        AGUARDA_SER (2,"Serviço em andamento"),
        AGUARDA_RET (3, "Serviço concluído - Aguardando retirada"),
        CONCLUIDO   (4, "Serviço concluído - Entregue ao cliente");

        private Integer codigo;
        private String descricao;


        StatusOS(Integer codigo, String descricao) {
            this.codigo = codigo;
            this.descricao = descricao;
        }

        public Integer getCodigo() {
            return codigo;
        }

        public String getDescricao() {
            return descricao;
    }


}
