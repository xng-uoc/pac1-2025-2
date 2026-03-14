interfaces {
    dummy dum0 {
        address "2.2.2.2/32"
    }
    ethernet eth0 {
        address "172.20.20.42/24"
        address "3fff:172:20:20::5/64"
        description "Management Interface"
    }
    ethernet eth1 {
        address "10.1.2.2/30"
    }
    ethernet eth2 {
        address "10.2.3.1/30"
    }
    ethernet eth3 {
        address "192.168.2.1/24"
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDizCCAnOgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzEtMjAyNS0yIGxhYiBDQTAeFw0yNjAzMTQxNDM4NDdaFw0yNzAzMTQxNDM4NDdaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJwYWMxLTIwMjUtMiBsYWIgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCmKHN6gZaYS1fq5ATwTUCAKFD2G7kWTv6jeojbIwcIsc9kXpsZfbELB31CNVM82Ts/oa+5xfX+nnLSP34mBE43aEzHpXDq5THgwwyo4thRpQlJOc03TyyByBMKiYnTPXoVotV8Gcg8hTseQuwlzycBPGlGVZhCYdQUJ92JslG+KOh/ew8ie9OKsfqZxVE6FgTWHve67uRuKHL46tG5HsXM9lVyHylxuQePnZDp4H+qNWBY0MARj+U9s7vsdKcNFPHb85ln6/9BCgN3xy99gs8t6Qy2J3jDn82BMZevRtE1mgUurfSFYyHN+EOVHE5bO6tI8qqFqLJCGIowREuUKR6bAgMBAAGjYTBfMA4GA1UdDwEB/wQEAwIChDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUh/abuDGDWf7JS1YxGa253EiZgQowDQYJKoZIhvcNAQELBQADggEBAH6WIZYhTpz+oSk4XfZ24wrNhHlr8z4tlt1QfGfOcFI1MJ4mI+68YYJoh3SH7xD+iomLyh1tLYpB7h9FRiUMnKjZVzn9XlRx7PtlIEzA+kczUZruMv3JOn1+XYXS6iEFkuc8l1KgWPGer9ee4CR0Dr1nih+Yh8N0Wy5IdNuJlss4egbuQsFkGKqHw/JdIZWg5W27/U3wF6Y5mtmuSE/xzT5XYjqTubwnAzVEnnSf0QBC0owSOelEFjAhpQzi5055aTdqOsVJ82aNL+9Y7+qZn0kJDHh1i1ApbV54mmhwFBamFpapUVqPufc9X9EJt6/w2uo1hYxH9l2jHRwSULMzO+M="
    }
    certificate self {
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzEtMjAyNS0yIGxhYiBDQTAeFw0yNjAzMTQxNDM4NDhaFw0yNzAzMTQxNDM4NDhaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMDIucGFjMS0yMDI1LTIuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCtRWVq0I+TtFSfLxyGTcCjxt6HEkd13n1V0Lb8dULDjQxFJ6jyM8lPY2TeaA4nyn/pdtWIVCKlm1awCoe8ZCZUWdMXHcR/0hjnJUyTIt4rtkVZwUHMEFyDxrz2ZRbyJ5tzVLk4lavoAl+CieqZgpgB/mPJQ5YWunDIn0BXM1KvklNUl4PbaknY+EPRwNSgAdLmwLX2wfTU8vWRCJHB0GTNhuWWskFIBRLVzDy9/TMmMJYhgCvE6+ohb9rhjeTvfTJgjyTLxjO8MIj1xjKtUwsEHO2S9GMtKW0Ye/pf8mcWBVgUII/7dxxk2C1Dk/wHwIGc4D/7CwL8dxQBt7Hs7hxjAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUh/abuDGDWf7JS1YxGa253EiZgQowRwYDVR0RBEAwPoIGdnlvczAyghdjbGFiLXBhYzEtMjAyNS0yLXZ5b3MwMoIVdnlvczAyLnBhYzEtMjAyNS0yLmlvhwSsFBQqMA0GCSqGSIb3DQEBCwUAA4IBAQANzUwWcO0YwEkAHnDPNLmAhmkW239ddXinSEhsCVxRLQNy2eNgozA8PWRWkLcmpgsmXVrgKKa6WSu/BsZvNHJS6hC3nRyXk+voYE2UMi6i6j8G3HSOD6iecFgcJ0V6GMy7ix/DtYIgRYE98/RthAAxUSohTTPwx8p7jDIDUrMVHO7lUSayJbAc7qzPKzaqExnpelS06hqDiwS56cDJNs1e4oECE2juBn4IjJou9xZ+uozo6C+Z1xzxd7yF2F21KMvTU46zfTnX7tFJgu0FvCdAG9KJZjRQGY7khzHwCZJXcI9iKwwgzSgIVhWw0+DGKJmj0P8pJErsRf51tx+Isjrs"
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCtRWVq0I+TtFSfLxyGTcCjxt6HEkd13n1V0Lb8dULDjQxFJ6jyM8lPY2TeaA4nyn/pdtWIVCKlm1awCoe8ZCZUWdMXHcR/0hjnJUyTIt4rtkVZwUHMEFyDxrz2ZRbyJ5tzVLk4lavoAl+CieqZgpgB/mPJQ5YWunDIn0BXM1KvklNUl4PbaknY+EPRwNSgAdLmwLX2wfTU8vWRCJHB0GTNhuWWskFIBRLVzDy9/TMmMJYhgCvE6+ohb9rhjeTvfTJgjyTLxjO8MIj1xjKtUwsEHO2S9GMtKW0Ye/pf8mcWBVgUII/7dxxk2C1Dk/wHwIGc4D/7CwL8dxQBt7Hs7hxjAgMBAAECggEAClahViiQOImXoaaHoYJ9eQgs+jWJVVYWImBWsA+LEUHsNoAcS39IMVgb36KpHY9ZPHkzr8kIBtuS5jlqnz9Wg3fslBeERErT447NLTD1EqSd1LIm6+HEs17Qot77Py2aeoeBRF1h1Bu4I9Yjd6SxedpPjTsJdzJeol8mJqMlpDC8s3dN8WT3Bt5MO0Nd0so0mlerM+eOByh8jEKajrVQI7KDqxZm5Bwgzj2pE5Udw4+mt0sseN+FdRVBlgGOuOgh0Damnuz/krVGN2xLbV9YJdCfLWfPKiZPDAcbqDLFGCcRjZS8TgbVCw+tvUGEFnFJf1sOH0CVbVrtbE3cJAMV4QKBgQDEnH5Lq/AjEzSKaEH+stxddtnqK5Ab7ISzvTphwiEiyVb9nPMN3PILVs3Y/RECOHiDMOcO7nN1w0Ve7fYIwvUHxuZ+OCS0HYpuwPqIxsq61WR8r3dofpVN3oehrJ26AO+lRVsb1+CH/r1htI2k+9SN/2+GhMZSEAR2Y7rfIvGmcQKBgQDhnA5j+yyylBjY7kSmsTKt5lYe5mbFdgZx4BTh8OW8ouzMvsy13JJvSBnz2oeWpIVctB0AYM3NeShHq1+CoKi43EY98Y7fgVnnLuRPpH2bomUZ7JE3C7U8VmELFF6QemVkSphgNXOuTyTNjH+ba1O4vUlvOTTTRrnheFNBTn/iEwKBgCwYFNMPyplzMzNfUn22y2lCwHieMIGyt8g/xhoqmZfdo97ZFkGjrb0RSLVDfE8NLyntC8TzgX2Fv8ccgzNP1fhaiVMBcGncvjE8onOOceUY+qJkD9mlmgKOx8hgmDchAp4EQfyqm7akUQDap3G68N6vzOlUWc4JvZZ3o29rvNphAoGBANi7QB/QNXpARzZufsjbxWHFusnocKYU4dAXgjgjYa+7nFx8ls/GW25IB5Z5QnP3DJ6n8IxicpKHZ6ih+xjUGgGsqlXrbmNMMf+iznWsAXa3pQQofMAyoSKboJIyOT32Nt0HxCX4c27qXOKRrCy0CDOas6cDf7nPYdY171T3gma9AoGBAMGEMEN1DH3EfNhfeWfJpTXXz0aJWb2rgwEDSL858lrWFczGFa1cUoXeoz0kRAznsgBzbOoA2VU1uJBdLZtTLDGrqJDDy4ptk/+zE9sTTqgXLxhdV0nAe8N90+mTGYI3TSBO0w8GU2zDjDpxfv/RWEQxZRrJJPjYv0wT4vNR84Sx"
        }
    }
}
protocols {
    ospf {
        area 0 {
            network "10.1.2.0/30"
            network "10.2.3.0/30"
            network "192.168.2.0/24"
            network "2.2.2.2/32"
        }
        interface dum0 {
            passive {
            }
        }
        interface eth1 {
            network "point-to-point"
        }
        interface eth2 {
            network "point-to-point"
        }
        interface eth3 {
            passive {
            }
        }
        parameters {
            router-id "2.2.2.2"
        }
    }
}
service {
    https {
        api {
            keys {
                id admin {
                    key "admin"
                }
            }
            rest {
            }
        }
        certificates {
            ca-certificate "clab"
            certificate "self"
        }
        listen-address "0.0.0.0"
    }
    ntp {
        allow-client {
            address "127.0.0.0/8"
            address "169.254.0.0/16"
            address "10.0.0.0/8"
            address "172.16.0.0/12"
            address "192.168.0.0/16"
            address "::1/128"
            address "fe80::/10"
            address "fc00::/7"
        }
        server time1.vyos.net {
        }
        server time2.vyos.net {
        }
        server time3.vyos.net {
        }
    }
    ssh {
        listen-address "0.0.0.0"
    }
}
system {
    config-management {
        commit-revisions "100"
    }
    host-name "vyos02"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$Ybacc3jb7HvhQRTk$ePlKFE1/RuOEaMV0ElAwwHFnJRk9E0nWtanhf8nOgOPtQXc2A3CMw1gmSO8oe2SWNxWP9BbqDXK5c5R31LtcP/"
                public-keys clab {
                    key "AAAAB3NzaC1yc2EAAAADAQABAAABgQCqnzaeMn5uFxEAkG917XwNy+xwwZlsUy86pLZzgXMyO7X3EVIyEv6/LbgR9mXYZOtzDJHPecVi5H+lSy2jFGwXaacGAhcjg3XQQevKoaBW2g45WI38Bjnxm8hACRo/5aoY80ResYIOdtvAoLiUOGe9x74lUsUVT7iv9DSuyMlVI6CeZkqzcMaAu7fKSfIvl40YmgW1lC3OKANGIT5LLL6310PfuBZsQHh2Ye/F2q3bOgL8NSJ/dp7Ml6mvLLwyCwqHlxATWB7V2vUHOokEKo15HOqC/maugeht486b1gEKrMpL1oZsBrEBAs5MkHfYGNqfmY07crI83F2VnF6N4/ez8eP8EJoBj/99rZMX6Ish04Bw8MmTfppBZKrhaVFGNq9e6YSgjd6mFNmZkX/GO89CSd9TCFMdqYJYyc+3YmnHRL4AWgO/er9Ja/K2X6R6Dw2lo4PXRWfyspN7HAhZkZV2c1Uaxx3MyOC1fmvzou7b3uBEEpb40lOijEGVL7q2780="
                    type "ssh-rsa"
                }
            }
        }
    }
    syslog {
        local {
            facility all {
                level "info"
            }
            facility local7 {
                level "debug"
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@19:flow-accounting@1:https@7:ids@1:interfaces@33:ipoe-server@4:ipsec@13:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:ntp@3:openconnect@3:openvpn@4:ospf@2:pim@1:policy@8:pppoe-server@11:pptp@5:qos@2:quagga@11:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@2:sstp@6:system@29:vrf@3:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 1.5-stream-2025-Q2
