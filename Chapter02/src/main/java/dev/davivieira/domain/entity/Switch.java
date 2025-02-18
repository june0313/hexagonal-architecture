package dev.davivieira.domain.entity;

import dev.davivieira.domain.vo.IP;
import dev.davivieira.domain.vo.Network;
import dev.davivieira.domain.vo.SwitchId;
import dev.davivieira.domain.vo.SwitchType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Switch {

    private final SwitchType switchType;
    private final SwitchId switchId;
    private final List<Network> networks;
    private final IP address;

    public Switch(SwitchType switchType, SwitchId switchId, List<Network> networks, IP address) {
        this.switchType = switchType;
        this.switchId = switchId;
        this.networks = networks;
        this.address = address;
    }

    public Switch addNetwork(Network network) {
        var networks = new ArrayList<>(Collections.singletonList(network));
        networks.add(network);
        return new Switch(this.switchType, this.switchId, networks, this.address);
    }

    public List<Network> getNetworks() {
        return networks;
    }
}
