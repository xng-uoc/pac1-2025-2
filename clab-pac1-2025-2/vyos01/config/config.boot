interfaces {
    dummy dum0 {
        address "1.1.1.1/32"
    }
    ethernet eth0 {
        address "172.20.20.41/24"
        address "3fff:172:20:20::7/64"
        description "Management Interface"
    }
    ethernet eth1 {
        address "10.1.2.1/30"
    }
    ethernet eth2 {
        address "10.1.3.1/30"
    }
    ethernet eth3 {
        address "192.168.1.1/24"
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDizCCAnOgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzEtMjAyNS0yIGxhYiBDQTAeFw0yNjAzMTQxNDM4NDdaFw0yNzAzMTQxNDM4NDdaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJwYWMxLTIwMjUtMiBsYWIgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCmKHN6gZaYS1fq5ATwTUCAKFD2G7kWTv6jeojbIwcIsc9kXpsZfbELB31CNVM82Ts/oa+5xfX+nnLSP34mBE43aEzHpXDq5THgwwyo4thRpQlJOc03TyyByBMKiYnTPXoVotV8Gcg8hTseQuwlzycBPGlGVZhCYdQUJ92JslG+KOh/ew8ie9OKsfqZxVE6FgTWHve67uRuKHL46tG5HsXM9lVyHylxuQePnZDp4H+qNWBY0MARj+U9s7vsdKcNFPHb85ln6/9BCgN3xy99gs8t6Qy2J3jDn82BMZevRtE1mgUurfSFYyHN+EOVHE5bO6tI8qqFqLJCGIowREuUKR6bAgMBAAGjYTBfMA4GA1UdDwEB/wQEAwIChDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUh/abuDGDWf7JS1YxGa253EiZgQowDQYJKoZIhvcNAQELBQADggEBAH6WIZYhTpz+oSk4XfZ24wrNhHlr8z4tlt1QfGfOcFI1MJ4mI+68YYJoh3SH7xD+iomLyh1tLYpB7h9FRiUMnKjZVzn9XlRx7PtlIEzA+kczUZruMv3JOn1+XYXS6iEFkuc8l1KgWPGer9ee4CR0Dr1nih+Yh8N0Wy5IdNuJlss4egbuQsFkGKqHw/JdIZWg5W27/U3wF6Y5mtmuSE/xzT5XYjqTubwnAzVEnnSf0QBC0owSOelEFjAhpQzi5055aTdqOsVJ82aNL+9Y7+qZn0kJDHh1i1ApbV54mmhwFBamFpapUVqPufc9X9EJt6/w2uo1hYxH9l2jHRwSULMzO+M="
    }
    certificate self {
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzEtMjAyNS0yIGxhYiBDQTAeFw0yNjAzMTQxNDM4NDhaFw0yNzAzMTQxNDM4NDhaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMDEucGFjMS0yMDI1LTIuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDAVzT4EWoVPAQ2Ek5YU1rAQ9Kgs/+WtE1+W1XM3uaKep0ivjlRqnPtm4nq2UHwk3CHsbh8Qncs/FzPSJioNtFh/zjQjAUIGMudDLr1RTlCZtdSD44NM/J256w6nDaTp5TxinQ30wkX8GirC2v6mbsqkJzk6PTaJUr2WJBH1CCy1D4/gynjZy9JNL7s5I4oBGSNeafPgTAvF+sehMdkH55p4eQluvmPftIWhS1fxjCCWD6IvKJOCK8Qc+QBYVTjeHtjvBy4uds3GEbFro8gdxyhLZ8UlAGFi7/ropOen2xeuUtTJUdULbxehv7Ss1QoGKWGneCo+F1XnTZpZMwObe3XAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUh/abuDGDWf7JS1YxGa253EiZgQowRwYDVR0RBEAwPoIGdnlvczAxghdjbGFiLXBhYzEtMjAyNS0yLXZ5b3MwMYIVdnlvczAxLnBhYzEtMjAyNS0yLmlvhwSsFBQpMA0GCSqGSIb3DQEBCwUAA4IBAQCg8ekMkxvcObEGNqZGI97vO7x7Rapd1kcj4r6h3ZVjkmvZTRB4uIRBtUS5c0x0Sn7/fWk9yEY9C9xqDNikvzVddlM5tlt9tpJgHshqnyJ1isfYujm5hQ008cRsaaE3MBOsm+GPYgKh8x1cZVI8dsW1EcA2BY3scZjBsbt0v9EzUToHyD2voKsIZMon6LDZ8KURQF3wsVzOPBLjS7YxrKpitOHd8qQf/tdF8ca14lOp5NWPYD5z+PIsQ3u/d7m+qHJ+aXuG+5MpQEc1ssKgFJnj1o8ukdC8ieoy8G7S+99hr5jHZefCSe0Zez4qKyQWLHn3mAudiUa89v77Blgu54jE"
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDAVzT4EWoVPAQ2Ek5YU1rAQ9Kgs/+WtE1+W1XM3uaKep0ivjlRqnPtm4nq2UHwk3CHsbh8Qncs/FzPSJioNtFh/zjQjAUIGMudDLr1RTlCZtdSD44NM/J256w6nDaTp5TxinQ30wkX8GirC2v6mbsqkJzk6PTaJUr2WJBH1CCy1D4/gynjZy9JNL7s5I4oBGSNeafPgTAvF+sehMdkH55p4eQluvmPftIWhS1fxjCCWD6IvKJOCK8Qc+QBYVTjeHtjvBy4uds3GEbFro8gdxyhLZ8UlAGFi7/ropOen2xeuUtTJUdULbxehv7Ss1QoGKWGneCo+F1XnTZpZMwObe3XAgMBAAECggEARUnlKgxT8+xX9AaqNIVqpuKH6R6Oz4KKfB95DEGsOWysWMzAJ1xJQOqMR48Wgw0KN8fdFt52wjzzTjTv0YFV8oCXvgEC+wS7rQrd+ueCFhqoLMavvK/fA9i3obGOs6hmLpFbBpU+rGINwrhtoKxq0Y2hB5GoS0Gt/IqxBz8yvFi6VprsjKWf4WKIKvN+XR4HRK5F4roQcQlsk+8LQDMxDTxiEI9EgaBbpQBRq1xJF7RpBfjZFVPMbBES96I5zDxBlrb/q2Wq0JCJ5e5fXB4ME8UuHjb/G7r++3mSxX23DnRD3DqCtivGMHUVrLnBQGjaUzMBU73VC5H2cWQeYtis6QKBgQD5DpEkCNvHASudDOg3znHm4pErIzsUlbC9TSh7u+ofDFFstdL12a/SDBLxyvCJYIemL4P+AO8065iFX3kxW15sMOAQGIRr4xbD1rQS+97uH2XalQZUZzU4cgIcaR04WzMYW+ybUUgV1wV9qmv4W318Lims7qMgvCOT0XTk6jODawKBgQDFs+AsTwsXtF3pB20w8dR1HYmzCpbxZVtG9ahAQhIoCiGOy1VmtfvKfhn7hcNKSqrBPtG0nlQAUhnIkGSKIExPKesVuBUC080tM3vPYb8TFg9bPOMu5PQ6DHYIdyjetR+eKxS6GamsFB5+IlT6YYyBFAoxKSZlWiemDHbW8SUGRQKBgQDrULEfy+Ljnx53D7fk6oDB9nXUvT/YDirkYR+L8Rue5EOWpCDDuz8dBd1saSNlmTfxc9mRR467gJImCfP3B24qaO97Jb8QNIrQ1G5ltWaHtFDG+qD1ZGJrh4SpFUPPeJPJQylGAsFKKVP9zOSgzsi8aN1lkD++8SPoSTHaC9JKKwKBgBqlaMRwDt2uCK48uwHKxkjWp1WDSt7UO14wA/JNNWdCHk3BqAwE4R/kqRnWaIDd2W/cSKVgZY/5gNIga/yV59MPoki2G9batx+tfbVwxjELWxx/81rBrw0X2ty/OrnxjYZi5hNDHDQ+LfHwLKXmeep3yfvgQPWOFiPyMB4+ODBFAoGBANg5y3UMrvWulOEpCKSUb2bm56OvBNCaagasfvYaaqCiNbV8l3EohoQdQ7/1CcKFmTTYAq17GN4kBbdFVh74Lq+ONapZlrxyxREr3nL0eZNGjhTuScs0ccgJ15JyzZP3Lyk0yfISoRsoNlwdBNyAsplcRTnHjnRlq3jK0cXidhhz"
        }
    }
}
protocols {
    ospf {
        area 0 {
            network "10.1.2.0/30"
            network "192.168.1.0/24"
            network "10.1.3.0/30"
            network "1.1.1.1/32"
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
            router-id "1.1.1.1"
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
    host-name "vyos01"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$0LPK0nm32yggxzya$IH4Yd2.nUAa9KqsJzM3wVtjXQkjE42Zo9J7z97KtwFo8O6QOI0IitdJElL8Z1hwJXlXE3J1XdUzLpxxdiAVM/1"
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
