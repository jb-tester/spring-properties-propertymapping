# Spring Debugger: property source recognizing in case of @PropertyMapping using

When the custom datasource configuration properties are provided via the custom
@PropertyMapping annotations, then
1. the debug datasource is detected properly
2. however, the actual value for the configuration properties overridden via @PropertyMapping(<property_key>) annotations is not shown


