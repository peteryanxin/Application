package com.example.administrator.myapplication.controller.bean;

import java.util.List;

public class TestBean2 {

    /**
     * apiVersion : releases/release-0.1
     * swaggerVersion : 1.2
     * basePath : /gateway
     * resourcePath : /gateway
     * produces : ["application/json"]
     * apis : [{"path":"/public/prepareTransfer","operations":[{"method":"POST","summary":"prepare new payment","notes":"prepare a new payment based on fiat amount","type":"PrepareTransfer","nickname":"prepareTransfer","consumes":["application/json"],"parameters":[{"name":"merchant_id","description":"the merchant id of the merchant receiving the payment","required":true,"type":"string","paramType":"form"},{"name":"currency","description":"the currency of the amount to pay","required":true,"type":"string","paramType":"form"},{"name":"amount","description":"the amount in currency to pay","required":true,"type":"float","paramType":"form"},{"name":"reference_id","description":"reference id for merchant callbacks","required":false,"type":"string","paramType":"form"}]}]},{"path":"/public/checkTransfer","operations":[{"method":"POST","summary":"check transfer state","notes":"check the state of a transfer previously prepared","type":"CheckTransfer","nickname":"checkTransfer","consumes":["application/json"],"parameters":[{"name":"address","description":"address that was returned as receival address by prepareTransfer","required":true,"type":"string","paramType":"form"}]}]}]
     * models : {"PrepareTransfer":{"id":"PrepareTransfer","properties":{"success":{"type":"boolean","required":true},"infos":{"type":"array","items":{"$ref":"Message"}},"warnings":{"type":"array","items":{"$ref":"Message"}},"errors":{"type":"array","items":{"$ref":"Message"}},"results":{"$ref":"PrepareTransferResult","required":true}}},"PrepareTransferResult":{"properties":{"address":{"type":"string","required":true,"description":"the cryptocoin target address"},"amount":{"type":"double","required":true,"description":"the cryptocoin amount to pay"},"currency":{"type":"string","required":true,"description":"the cryptocoin currency of the amount to pay"},"validity":{"type":"integer","description":"the validity of the transfer in milliseconds"}}},"CheckTransfer":{"id":"CheckTransfer","properties":{"success":{"type":"boolean","required":true},"infos":{"type":"array","items":{"$ref":"Message"}},"warnings":{"type":"array","items":{"$ref":"Message"}},"errors":{"type":"array","items":{"$ref":"Message"}},"results":{"$ref":"CheckTransferResult","required":true}}},"CheckTransferResult":{"properties":{"received":{"type":"boolean","required":true,"description":"Whether the price was received"},"retry":{"type":"boolean","required":true,"description":"Whether to retry this request"}}},"Message":{"id":"Message","properties":{"MESSAGE_CODE":{"type":"array","items":{"type":"string","required":true},"required":true}}}}
     */

    private String apiVersion;
    private String swaggerVersion;
    private String basePath;
    private String resourcePath;
    private ModelsBean models;
    private List<String> produces;
    private List<ApisBean> apis;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getSwaggerVersion() {
        return swaggerVersion;
    }

    public void setSwaggerVersion(String swaggerVersion) {
        this.swaggerVersion = swaggerVersion;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public ModelsBean getModels() {
        return models;
    }

    public void setModels(ModelsBean models) {
        this.models = models;
    }

    public List<String> getProduces() {
        return produces;
    }

    public void setProduces(List<String> produces) {
        this.produces = produces;
    }

    public List<ApisBean> getApis() {
        return apis;
    }

    public void setApis(List<ApisBean> apis) {
        this.apis = apis;
    }

    public static class ModelsBean {
        /**
         * PrepareTransfer : {"id":"PrepareTransfer","properties":{"success":{"type":"boolean","required":true},"infos":{"type":"array","items":{"$ref":"Message"}},"warnings":{"type":"array","items":{"$ref":"Message"}},"errors":{"type":"array","items":{"$ref":"Message"}},"results":{"$ref":"PrepareTransferResult","required":true}}}
         * PrepareTransferResult : {"properties":{"address":{"type":"string","required":true,"description":"the cryptocoin target address"},"amount":{"type":"double","required":true,"description":"the cryptocoin amount to pay"},"currency":{"type":"string","required":true,"description":"the cryptocoin currency of the amount to pay"},"validity":{"type":"integer","description":"the validity of the transfer in milliseconds"}}}
         * CheckTransfer : {"id":"CheckTransfer","properties":{"success":{"type":"boolean","required":true},"infos":{"type":"array","items":{"$ref":"Message"}},"warnings":{"type":"array","items":{"$ref":"Message"}},"errors":{"type":"array","items":{"$ref":"Message"}},"results":{"$ref":"CheckTransferResult","required":true}}}
         * CheckTransferResult : {"properties":{"received":{"type":"boolean","required":true,"description":"Whether the price was received"},"retry":{"type":"boolean","required":true,"description":"Whether to retry this request"}}}
         * Message : {"id":"Message","properties":{"MESSAGE_CODE":{"type":"array","items":{"type":"string","required":true},"required":true}}}
         */

        private PrepareTransferBean PrepareTransfer;
        private PrepareTransferResultBean PrepareTransferResult;
        private CheckTransferBean CheckTransfer;
        private CheckTransferResultBean CheckTransferResult;
        private MessageBean Message;

        public PrepareTransferBean getPrepareTransfer() {
            return PrepareTransfer;
        }

        public void setPrepareTransfer(PrepareTransferBean PrepareTransfer) {
            this.PrepareTransfer = PrepareTransfer;
        }

        public PrepareTransferResultBean getPrepareTransferResult() {
            return PrepareTransferResult;
        }

        public void setPrepareTransferResult(PrepareTransferResultBean PrepareTransferResult) {
            this.PrepareTransferResult = PrepareTransferResult;
        }

        public CheckTransferBean getCheckTransfer() {
            return CheckTransfer;
        }

        public void setCheckTransfer(CheckTransferBean CheckTransfer) {
            this.CheckTransfer = CheckTransfer;
        }

        public CheckTransferResultBean getCheckTransferResult() {
            return CheckTransferResult;
        }

        public void setCheckTransferResult(CheckTransferResultBean CheckTransferResult) {
            this.CheckTransferResult = CheckTransferResult;
        }

        public MessageBean getMessage() {
            return Message;
        }

        public void setMessage(MessageBean Message) {
            this.Message = Message;
        }

        public static class PrepareTransferBean {
            /**
             * id : PrepareTransfer
             * properties : {"success":{"type":"boolean","required":true},"infos":{"type":"array","items":{"$ref":"Message"}},"warnings":{"type":"array","items":{"$ref":"Message"}},"errors":{"type":"array","items":{"$ref":"Message"}},"results":{"$ref":"PrepareTransferResult","required":true}}
             */

            private String id;
            private PropertiesBean properties;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public PropertiesBean getProperties() {
                return properties;
            }

            public void setProperties(PropertiesBean properties) {
                this.properties = properties;
            }

            public static class PropertiesBean {
                /**
                 * success : {"type":"boolean","required":true}
                 * infos : {"type":"array","items":{"$ref":"Message"}}
                 * warnings : {"type":"array","items":{"$ref":"Message"}}
                 * errors : {"type":"array","items":{"$ref":"Message"}}
                 * results : {"$ref":"PrepareTransferResult","required":true}
                 */

                private SuccessBean success;
                private InfosBean infos;
                private WarningsBean warnings;
                private ErrorsBean errors;
                private ResultsBean results;

                public SuccessBean getSuccess() {
                    return success;
                }

                public void setSuccess(SuccessBean success) {
                    this.success = success;
                }

                public InfosBean getInfos() {
                    return infos;
                }

                public void setInfos(InfosBean infos) {
                    this.infos = infos;
                }

                public WarningsBean getWarnings() {
                    return warnings;
                }

                public void setWarnings(WarningsBean warnings) {
                    this.warnings = warnings;
                }

                public ErrorsBean getErrors() {
                    return errors;
                }

                public void setErrors(ErrorsBean errors) {
                    this.errors = errors;
                }

                public ResultsBean getResults() {
                    return results;
                }

                public void setResults(ResultsBean results) {
                    this.results = results;
                }

                public static class SuccessBean {
                    /**
                     * type : boolean
                     * required : true
                     */

                    private String type;
                    private boolean required;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }
                }

                public static class InfosBean {
                    /**
                     * type : array
                     * items : {"$ref":"Message"}
                     */

                    private String type;
                    private ItemsBean items;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public ItemsBean getItems() {
                        return items;
                    }

                    public void setItems(ItemsBean items) {
                        this.items = items;
                    }

                    public static class ItemsBean {
                        /**
                         * $ref : Message
                         */

                        private String $ref;

                        public String get$ref() {
                            return $ref;
                        }

                        public void set$ref(String $ref) {
                            this.$ref = $ref;
                        }
                    }
                }

                public static class WarningsBean {
                    /**
                     * type : array
                     * items : {"$ref":"Message"}
                     */

                    private String type;
                    private ItemsBeanX items;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public ItemsBeanX getItems() {
                        return items;
                    }

                    public void setItems(ItemsBeanX items) {
                        this.items = items;
                    }

                    public static class ItemsBeanX {
                        /**
                         * $ref : Message
                         */

                        private String $ref;

                        public String get$ref() {
                            return $ref;
                        }

                        public void set$ref(String $ref) {
                            this.$ref = $ref;
                        }
                    }
                }

                public static class ErrorsBean {
                    /**
                     * type : array
                     * items : {"$ref":"Message"}
                     */

                    private String type;
                    private ItemsBeanXX items;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public ItemsBeanXX getItems() {
                        return items;
                    }

                    public void setItems(ItemsBeanXX items) {
                        this.items = items;
                    }

                    public static class ItemsBeanXX {
                        /**
                         * $ref : Message
                         */

                        private String $ref;

                        public String get$ref() {
                            return $ref;
                        }

                        public void set$ref(String $ref) {
                            this.$ref = $ref;
                        }
                    }
                }

                public static class ResultsBean {
                    /**
                     * $ref : PrepareTransferResult
                     * required : true
                     */

                    private String $ref;
                    private boolean required;

                    public String get$ref() {
                        return $ref;
                    }

                    public void set$ref(String $ref) {
                        this.$ref = $ref;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }
                }
            }
        }

        public static class PrepareTransferResultBean {
            /**
             * properties : {"address":{"type":"string","required":true,"description":"the cryptocoin target address"},"amount":{"type":"double","required":true,"description":"the cryptocoin amount to pay"},"currency":{"type":"string","required":true,"description":"the cryptocoin currency of the amount to pay"},"validity":{"type":"integer","description":"the validity of the transfer in milliseconds"}}
             */

            private PropertiesBeanX properties;

            public PropertiesBeanX getProperties() {
                return properties;
            }

            public void setProperties(PropertiesBeanX properties) {
                this.properties = properties;
            }

            public static class PropertiesBeanX {
                /**
                 * address : {"type":"string","required":true,"description":"the cryptocoin target address"}
                 * amount : {"type":"double","required":true,"description":"the cryptocoin amount to pay"}
                 * currency : {"type":"string","required":true,"description":"the cryptocoin currency of the amount to pay"}
                 * validity : {"type":"integer","description":"the validity of the transfer in milliseconds"}
                 */

                private AddressBean address;
                private AmountBean amount;
                private CurrencyBean currency;
                private ValidityBean validity;

                public AddressBean getAddress() {
                    return address;
                }

                public void setAddress(AddressBean address) {
                    this.address = address;
                }

                public AmountBean getAmount() {
                    return amount;
                }

                public void setAmount(AmountBean amount) {
                    this.amount = amount;
                }

                public CurrencyBean getCurrency() {
                    return currency;
                }

                public void setCurrency(CurrencyBean currency) {
                    this.currency = currency;
                }

                public ValidityBean getValidity() {
                    return validity;
                }

                public void setValidity(ValidityBean validity) {
                    this.validity = validity;
                }

                public static class AddressBean {
                    /**
                     * type : string
                     * required : true
                     * description : the cryptocoin target address
                     */

                    private String type;
                    private boolean required;
                    private String description;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }
                }

                public static class AmountBean {
                    /**
                     * type : double
                     * required : true
                     * description : the cryptocoin amount to pay
                     */

                    private String type;
                    private boolean required;
                    private String description;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }
                }

                public static class CurrencyBean {
                    /**
                     * type : string
                     * required : true
                     * description : the cryptocoin currency of the amount to pay
                     */

                    private String type;
                    private boolean required;
                    private String description;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }
                }

                public static class ValidityBean {
                    /**
                     * type : integer
                     * description : the validity of the transfer in milliseconds
                     */

                    private String type;
                    private String description;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }
                }
            }
        }

        public static class CheckTransferBean {
            /**
             * id : CheckTransfer
             * properties : {"success":{"type":"boolean","required":true},"infos":{"type":"array","items":{"$ref":"Message"}},"warnings":{"type":"array","items":{"$ref":"Message"}},"errors":{"type":"array","items":{"$ref":"Message"}},"results":{"$ref":"CheckTransferResult","required":true}}
             */

            private String id;
            private PropertiesBeanXX properties;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public PropertiesBeanXX getProperties() {
                return properties;
            }

            public void setProperties(PropertiesBeanXX properties) {
                this.properties = properties;
            }

            public static class PropertiesBeanXX {
                /**
                 * success : {"type":"boolean","required":true}
                 * infos : {"type":"array","items":{"$ref":"Message"}}
                 * warnings : {"type":"array","items":{"$ref":"Message"}}
                 * errors : {"type":"array","items":{"$ref":"Message"}}
                 * results : {"$ref":"CheckTransferResult","required":true}
                 */

                private SuccessBeanX success;
                private InfosBeanX infos;
                private WarningsBeanX warnings;
                private ErrorsBeanX errors;
                private ResultsBeanX results;

                public SuccessBeanX getSuccess() {
                    return success;
                }

                public void setSuccess(SuccessBeanX success) {
                    this.success = success;
                }

                public InfosBeanX getInfos() {
                    return infos;
                }

                public void setInfos(InfosBeanX infos) {
                    this.infos = infos;
                }

                public WarningsBeanX getWarnings() {
                    return warnings;
                }

                public void setWarnings(WarningsBeanX warnings) {
                    this.warnings = warnings;
                }

                public ErrorsBeanX getErrors() {
                    return errors;
                }

                public void setErrors(ErrorsBeanX errors) {
                    this.errors = errors;
                }

                public ResultsBeanX getResults() {
                    return results;
                }

                public void setResults(ResultsBeanX results) {
                    this.results = results;
                }

                public static class SuccessBeanX {
                    /**
                     * type : boolean
                     * required : true
                     */

                    private String type;
                    private boolean required;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }
                }

                public static class InfosBeanX {
                    /**
                     * type : array
                     * items : {"$ref":"Message"}
                     */

                    private String type;
                    private ItemsBeanXXX items;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public ItemsBeanXXX getItems() {
                        return items;
                    }

                    public void setItems(ItemsBeanXXX items) {
                        this.items = items;
                    }

                    public static class ItemsBeanXXX {
                        /**
                         * $ref : Message
                         */

                        private String $ref;

                        public String get$ref() {
                            return $ref;
                        }

                        public void set$ref(String $ref) {
                            this.$ref = $ref;
                        }
                    }
                }

                public static class WarningsBeanX {
                    /**
                     * type : array
                     * items : {"$ref":"Message"}
                     */

                    private String type;
                    private ItemsBeanXXXX items;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public ItemsBeanXXXX getItems() {
                        return items;
                    }

                    public void setItems(ItemsBeanXXXX items) {
                        this.items = items;
                    }

                    public static class ItemsBeanXXXX {
                        /**
                         * $ref : Message
                         */

                        private String $ref;

                        public String get$ref() {
                            return $ref;
                        }

                        public void set$ref(String $ref) {
                            this.$ref = $ref;
                        }
                    }
                }

                public static class ErrorsBeanX {
                    /**
                     * type : array
                     * items : {"$ref":"Message"}
                     */

                    private String type;
                    private ItemsBeanXXXXX items;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public ItemsBeanXXXXX getItems() {
                        return items;
                    }

                    public void setItems(ItemsBeanXXXXX items) {
                        this.items = items;
                    }

                    public static class ItemsBeanXXXXX {
                        /**
                         * $ref : Message
                         */

                        private String $ref;

                        public String get$ref() {
                            return $ref;
                        }

                        public void set$ref(String $ref) {
                            this.$ref = $ref;
                        }
                    }
                }

                public static class ResultsBeanX {
                    /**
                     * $ref : CheckTransferResult
                     * required : true
                     */

                    private String $ref;
                    private boolean required;

                    public String get$ref() {
                        return $ref;
                    }

                    public void set$ref(String $ref) {
                        this.$ref = $ref;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }
                }
            }
        }

        public static class CheckTransferResultBean {
            /**
             * properties : {"received":{"type":"boolean","required":true,"description":"Whether the price was received"},"retry":{"type":"boolean","required":true,"description":"Whether to retry this request"}}
             */

            private PropertiesBeanXXX properties;

            public PropertiesBeanXXX getProperties() {
                return properties;
            }

            public void setProperties(PropertiesBeanXXX properties) {
                this.properties = properties;
            }

            public static class PropertiesBeanXXX {
                /**
                 * received : {"type":"boolean","required":true,"description":"Whether the price was received"}
                 * retry : {"type":"boolean","required":true,"description":"Whether to retry this request"}
                 */

                private ReceivedBean received;
                private RetryBean retry;

                public ReceivedBean getReceived() {
                    return received;
                }

                public void setReceived(ReceivedBean received) {
                    this.received = received;
                }

                public RetryBean getRetry() {
                    return retry;
                }

                public void setRetry(RetryBean retry) {
                    this.retry = retry;
                }

                public static class ReceivedBean {
                    /**
                     * type : boolean
                     * required : true
                     * description : Whether the price was received
                     */

                    private String type;
                    private boolean required;
                    private String description;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }
                }

                public static class RetryBean {
                    /**
                     * type : boolean
                     * required : true
                     * description : Whether to retry this request
                     */

                    private String type;
                    private boolean required;
                    private String description;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }
                }
            }
        }

        public static class MessageBean {
            /**
             * id : Message
             * properties : {"MESSAGE_CODE":{"type":"array","items":{"type":"string","required":true},"required":true}}
             */

            private String id;
            private PropertiesBeanXXXX properties;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public PropertiesBeanXXXX getProperties() {
                return properties;
            }

            public void setProperties(PropertiesBeanXXXX properties) {
                this.properties = properties;
            }

            public static class PropertiesBeanXXXX {
                /**
                 * MESSAGE_CODE : {"type":"array","items":{"type":"string","required":true},"required":true}
                 */

                private MESSAGECODEBean MESSAGE_CODE;

                public MESSAGECODEBean getMESSAGE_CODE() {
                    return MESSAGE_CODE;
                }

                public void setMESSAGE_CODE(MESSAGECODEBean MESSAGE_CODE) {
                    this.MESSAGE_CODE = MESSAGE_CODE;
                }

                public static class MESSAGECODEBean {
                    /**
                     * type : array
                     * items : {"type":"string","required":true}
                     * required : true
                     */

                    private String type;
                    private ItemsBeanXXXXXX items;
                    private boolean required;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public ItemsBeanXXXXXX getItems() {
                        return items;
                    }

                    public void setItems(ItemsBeanXXXXXX items) {
                        this.items = items;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }

                    public static class ItemsBeanXXXXXX {
                        /**
                         * type : string
                         * required : true
                         */

                        private String type;
                        private boolean required;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public boolean isRequired() {
                            return required;
                        }

                        public void setRequired(boolean required) {
                            this.required = required;
                        }
                    }
                }
            }
        }
    }

    public static class ApisBean {
        /**
         * path : /public/prepareTransfer
         * operations : [{"method":"POST","summary":"prepare new payment","notes":"prepare a new payment based on fiat amount","type":"PrepareTransfer","nickname":"prepareTransfer","consumes":["application/json"],"parameters":[{"name":"merchant_id","description":"the merchant id of the merchant receiving the payment","required":true,"type":"string","paramType":"form"},{"name":"currency","description":"the currency of the amount to pay","required":true,"type":"string","paramType":"form"},{"name":"amount","description":"the amount in currency to pay","required":true,"type":"float","paramType":"form"},{"name":"reference_id","description":"reference id for merchant callbacks","required":false,"type":"string","paramType":"form"}]}]
         */

        private String path;
        private List<OperationsBean> operations;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public List<OperationsBean> getOperations() {
            return operations;
        }

        public void setOperations(List<OperationsBean> operations) {
            this.operations = operations;
        }

        public static class OperationsBean {
            /**
             * method : POST
             * summary : prepare new payment
             * notes : prepare a new payment based on fiat amount
             * type : PrepareTransfer
             * nickname : prepareTransfer
             * consumes : ["application/json"]
             * parameters : [{"name":"merchant_id","description":"the merchant id of the merchant receiving the payment","required":true,"type":"string","paramType":"form"},{"name":"currency","description":"the currency of the amount to pay","required":true,"type":"string","paramType":"form"},{"name":"amount","description":"the amount in currency to pay","required":true,"type":"float","paramType":"form"},{"name":"reference_id","description":"reference id for merchant callbacks","required":false,"type":"string","paramType":"form"}]
             */

            private String method;
            private String summary;
            private String notes;
            private String type;
            private String nickname;
            private List<String> consumes;
            private List<ParametersBean> parameters;

            public String getMethod() {
                return method;
            }

            public void setMethod(String method) {
                this.method = method;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getNotes() {
                return notes;
            }

            public void setNotes(String notes) {
                this.notes = notes;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public List<String> getConsumes() {
                return consumes;
            }

            public void setConsumes(List<String> consumes) {
                this.consumes = consumes;
            }

            public List<ParametersBean> getParameters() {
                return parameters;
            }

            public void setParameters(List<ParametersBean> parameters) {
                this.parameters = parameters;
            }

            public static class ParametersBean {
                /**
                 * name : merchant_id
                 * description : the merchant id of the merchant receiving the payment
                 * required : true
                 * type : string
                 * paramType : form
                 */

                private String name;
                private String description;
                private boolean required;
                private String type;
                private String paramType;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public boolean isRequired() {
                    return required;
                }

                public void setRequired(boolean required) {
                    this.required = required;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getParamType() {
                    return paramType;
                }

                public void setParamType(String paramType) {
                    this.paramType = paramType;
                }
            }
        }
    }
}
