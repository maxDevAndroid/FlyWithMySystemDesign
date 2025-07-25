# 🎨 FlyWithMySystemDesign - Design System em Jetpack Compose

Este repositório contém um **Design System completo** para Android utilizando **Jetpack Compose Material3**.  
Ele inclui **tokens de design (cores, tipografia, formas, espaçamento), componentes reutilizáveis, ícones customizados, animações e suporte a Material You.**

---

## ✨ **Recursos**
- **Tokens de Design:**
  - `AppColors` (paleta Light/Dark)
  - `AppTypography` (H1-H6, Body, Label, Display)
  - `AppShape` (small, medium, large)
  - `AppSpacing` (xs, sm, md, lg, xl, xxl)
  - `AppElevation` (none, small, medium, large)
  - `AppAnimations` (fade, scale, slide)

- **Componentes:**
  - Botões (`AppButton`, `AppOutlinedButton`, `AppTextButton`, `AppElevatedButton`)
  - FABs (`AppFab`, `AppExtendedFab`)
  - Cards (`AppCard`)
  - Chips (`AppTagChip`, `AppAssistChip`)
  - Campos (`AppRadio`, `AppCheckbox`, `AppSwitch`)
  - Estados (`AppLoadingState`, `AppErrorState`, `AppEmptyState`, `AppSuccessState`)
  - Tooltips (`AppTooltip`)
  - Snackbar (`AppSnackbar`)
  - BottomSheet (`AppBottomSheet`)
  - Layouts (`AppScaffold`, `AppToolbar`, `AppBottomBar`)

- **Ícones Customizados:**
  - `AppIcons` (Filled, Outlined, Rounded via `material-icons-extended`)
  - Vetores personalizados via `ImageVector.vectorResource`

- **Temas:**
  - `AppDynamicTheme` com **Material You (Dynamic Color)** e fallback Light/Dark.

- **Animações:**
  - `fadeInOut`, `scaleInOut` e animações customizadas para interação.

---

## 📦 **Instalação**

Adicione no seu `build.gradle` (Module):
```gradle
implementation "androidx.compose.material3:material3:<versão>"
implementation "androidx.compose.material:material-icons-extended:<versão>"
```
