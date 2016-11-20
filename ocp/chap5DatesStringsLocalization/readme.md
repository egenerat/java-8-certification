# Dates, Strings, Localization

### Dates
- Period format begins with P: eg. P1Y2M3D
- Duration with PT (period of time)
- LocaleDate|DateTime|Time =x> Instant (because timezone is unknown)

### Strings

### Localization
- Locale can be created only by constructor
- Resource bundle => Java class
- Java class =x> resource bundles (may contain non-string types)
- once a resource bundle is chosen, only look for strings in hierarchy
-  